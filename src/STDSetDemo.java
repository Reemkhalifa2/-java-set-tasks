import java.util.*; // Import all utility classes like Set and HashSet

public class STDSetDemo {
    public static void main(String[] args) {

        // Create a Set to store student names (no duplicates allowed)
        Set<String> stdNames = new HashSet<>();

        // Add student names to the Set
        stdNames.add("Reem");
        stdNames.add("Sara");
        stdNames.add("Sama");
        stdNames.add("Bayan");
        stdNames.add("Noor");

        // Print all elements in the Set
        System.out.println(stdNames);

        // Try to add a duplicate element (it will not be added)
        stdNames.add("Bayan");

        // Print the Set after attempting to add a duplicate
        System.out.println("After Adding a Duplicate: " + stdNames);

        // Check if "Reem" exists in the Set (returns true or false)
        System.out.println(stdNames.contains("Reem"));

        // Remove an element from the Set
        stdNames.remove("Noor");

        // Print the Set after removal
        System.out.println(stdNames);

        // Print the number of elements in the Set
        System.out.println(stdNames.size());

        // Remove all elements from the Set
        stdNames.clear();

        // Print the Set after clearing
        System.out.println(stdNames);

        // Print the size
        System.out.println(stdNames.size());
    }
}