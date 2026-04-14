import java.util.*; // Import Set and HashSet

public class AnimalSetDemo {
    public static void main(String[] args) {

        // Declare Set
        Set<String> animals = new HashSet<>();

        animals.add("lion");
        animals.add("cow");
        animals.add("cat");
        animals.add("dog");
        animals.add("camel");

        // Display set
        for(String x : animals){
            System.out.println(x);
        }
        // Add one more animal
        animals.add("Monkey");
        System.out.println(animals);

        // Try adding duplicate
        animals.add("Lion");
        System.out.println("After adding a duplicate: " + animals);


        // check element that does exist
        System.out.println("is Cat in the set: " + animals.contains("cat"));

        // check element that does not exist
        System.out.println("is Tiger in the set " + animals.contains("Tiger"));

        // Remove existing animal
        animals.remove("camel");
        System.out.println(animals);


        // Display size
        System.out.println(animals.size());

        // Add new unique animal
        animals.add("Zebra");
        System.out.println(animals);

        // Updated size
        System.out.println(animals.size());

        // Clear all animals
        animals.clear();
        System.out.println("After clearing: " + animals);

        // Confirm empty
        System.out.println("size of the set after clear(): " + animals.size());

    }
}