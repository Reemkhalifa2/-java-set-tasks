import java.util.*;
public class STDSetDemo {
    public static void main(String[] args) {

        // Create a Set
        Set<String> stdNames = new HashSet<>();

        // Add student names to the Set
        stdNames.add("Reem");
        stdNames.add("Sara");
        stdNames.add("Sama");
        stdNames.add("Bayan");
        stdNames.add("Noor");

        // Print all elements in the Set
        System.out.println(stdNames);

        // Try to add a duplicate element
        stdNames.add("Bayan");
        System.out.println("After Adding a Duplicate: " + stdNames);

        System.out.println(stdNames.contains("Reem"));

        // Remove an element from the Set
        stdNames.remove("Noor");
        System.out.println(stdNames);

        // Print the number of elements in the Set
        System.out.println(stdNames.size());

        // Remove all elements from the Set
        stdNames.clear();
        System.out.println(stdNames);

        // Print the size
        System.out.println(stdNames.size());
    }
}