import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Linkedtest {
    public static void main(String[] args) {
        Product product1 = new Product(1,"gfsgsd",53.41);
        Product product2 = new Product(2,"cvb",53.42);
        Product product3 = new Product(3,"ee",59.41);
        Product product4 = new Product(4,"xcb",44.2);
        Product product5 = new Product(5,"xxxz",50.56);
        Product product6 = new Product(6,"jgjg",33.2);
        LinkedList<Product> list = new LinkedList<Product>();
        ProductManagerLinked productManager = new ProductManagerLinked(list);
        productManager.add(product1);
        productManager.add(product2);
        productManager.add(product3);
        productManager.add(product4);
        productManager.add(product5);
        productManager.add(product6);
        productManager.setProductinfor(5);
        if (productManager.removeProduct(4)){
            System.out.println("Đã xóa id 4");
        }
        System.out.println(productManager.toString());
        System.out.println(productManager.getProduct("ee"));
        Collections.sort(list,productManager);
        System.out.println(productManager.toString());
    }
}
