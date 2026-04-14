import java.util.*;

public class ProdNameSetDemo {
    public static void main(String[] args) {

        // create set
        Set<String> products = new HashSet<>();

        // add products
        products.add("Laptop");
        products.add("Phone");
        products.add("Tablet");
        products.add("Headphones");
        products.add("Smart Watch");

        // display products
        System.out.println(products);

        // add duplicate (no change)
        products.add("Laptop");
        System.out.println(products);

        // check if exists
        System.out.println(products.contains("Phone"));

        // remove product
        products.remove("Tablet");
        System.out.println(products);

        // display size
        System.out.println(products.size());

        // clear set
        products.clear();
        System.out.println(products);

        // confirm empty
        System.out.println(products.size());
    }
}