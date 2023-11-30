import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Product itemA = new Product("A", 1000);
        Product itemB = new Product("B", 2000);
        Product itemC = new Product("C", 3000);
        Product itemD = new Product("D", 4000);

        Set<Product> productSet = new HashSet<>();
        productSet.add(itemA);
        productSet.add(itemB);
        productSet.add(itemC);
        productSet.add(itemD);

        System.out.println("고유한 상품 목록");
        for (Product product : productSet) {
            System.out.println(product.getName() + " : " + product.getPrice());
        }

        System.out.println("--------------");

        Cart myCart = new Cart();

        myCart.addProduct(itemA, 1);
        myCart.addProduct(itemD, 2);
        myCart.addProduct(itemC, 3);
        System.out.println("장바구니 목록");
        myCart.showItems();

        myCart.removeProduct(itemC, 3);

        System.out.println("--------------");
        System.out.println("장바구니 목록");
        myCart.showItems();

    }
}