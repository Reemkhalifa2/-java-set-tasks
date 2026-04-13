import java.util.*;
public class CustomerSetDemo {
    public static void main(String[] args) {
        Set<String> customerID = new HashSet<>();
        customerID.add("A12");
        customerID.add("A13");
        customerID.add("A14");
        customerID.add("A15");
        customerID.add("A16");
        for(String id: customerID){
            System.out.println(id);
        }
        customerID.add("A15");
        System.out.println("------------");
        for(String id: customerID){
            System.out.println(id);
        }


    }
}
