import java.util.*;
public class RemoveSetDemo {
    public static void main(String[] args) {
        Set <String> prodName = new HashSet<>();
        prodName.add("Iphone");
        prodName.add("Camera");
        prodName.add("Headphone");
        prodName.add("Laptop");
        prodName.add("Charger");
        System.out.println("Before");
        for(String name : prodName){
            System.out.println(name);
        }
        System.out.println("After");
        prodName.remove("Iphone");// removed the element "iphone" from the set"
        for(String name : prodName){
            System.out.println(name);
        }

    }

}
