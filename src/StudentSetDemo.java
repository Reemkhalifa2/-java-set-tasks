import java.util.*;
public class StudentSetDemo {
    public static void main(String[] args) {
        Set<String> stdNames = new HashSet<>();
        stdNames.add("Reem");
        stdNames.add("Sara");
        stdNames.add("Sama");
        stdNames.add("Bayan");
        stdNames.add("Noor");
        for(String std : stdNames){
            System.out.print(std+", ");
        }
        stdNames.add("Bayan");
        System.out.println(stdNames.contains("Reem"));
        stdNames.remove("Noor");
        for(String std : stdNames){
            System.out.print(std+", ");
        }
        System.out.println(stdNames.size());
        stdNames.clear();
        for(String std : stdNames){
            System.out.print(std+", ");
        }
        System.out.println(stdNames.size());


    }
}
