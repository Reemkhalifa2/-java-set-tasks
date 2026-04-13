import java.util.*;
public class ClearSetDemo {
    public static void main(String[] args) {
        Set<String> userNames = new HashSet<>();
        userNames.add("Reem");
        userNames.add("Sara");
        userNames.add("Sama");
        userNames.add("Noor");
        userNames.add("Ahmed");

        for(String name : userNames){
            System.out.println(name);
        }
        System.out.println(userNames.size());
        userNames.clear();
        System.out.println("After clear the set");
        for(String name : userNames){
            System.out.println(name);
        }
    }
}
