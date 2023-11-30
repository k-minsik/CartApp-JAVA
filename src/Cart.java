import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cart {

    private Map<Product, Integer> cart = new HashMap<>();
    private int totalCount = 0;
    private int totalPrice = 0;

    public void addProduct(Product item, int quantity) {
        totalCount += quantity;
        totalPrice += item.getPrice() * quantity;
        cart.put(item, quantity);
    }

    public void removeProduct(Product item, int quantity) {
        Integer currentQuantity = cart.get(item);

        if (currentQuantity != null && quantity > 0) {
            if (quantity >= currentQuantity) {
                totalCount -= currentQuantity;
                totalPrice -= item.getPrice() * currentQuantity;
                cart.remove(item);
            } else {
                totalCount -= quantity;
                totalPrice -= item.getPrice() * quantity;
                cart.put(item, currentQuantity - quantity);
            }
        }
    }

    public void showItems() {
        for (Map.Entry<Product, Integer> item : cart.entrySet()) {
            System.out.println(item.getKey().getName() + " : " + item.getValue());
        }

        System.out.println("총 " + totalCount + "개 : " + totalPrice + "원");
    }

    public void clearCart() {
        cart.clear();
    }
}
