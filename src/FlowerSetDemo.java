import java.util.*; // Import Set and HashSet
public class FlowerSetDemo {
    public static void main(String[] args) {

        // Declare Set
        Set<String> Flowers = new HashSet<>();

        Flowers.add("Rose");
        Flowers.add("Lily");
        Flowers.add("Tulip");
        Flowers.add("Lavender");
        Flowers.add("Jasmine");

        // Display set
        for(String x : Flowers){
            System.out.println(x);
        }
        // Add one more element
        Flowers.add("Orchid");
        System.out.println(Flowers);

        // Try adding duplicate
        Flowers.add("Jasmine");
        System.out.println("After adding a duplicate: " + Flowers);


        // check element that does exist
        System.out.println("is Jasmine in the set: " + Flowers.contains("Jasmine"));

        // check element that does not exist
        System.out.println("is Sunflower in the set " + Flowers.contains("Sunflower"));

        // Remove existing element
        Flowers.remove("Jasmine");
        System.out.println(Flowers);


        // Display size
        System.out.println(Flowers.size());

        // Add new unique animal
        Flowers.add("Sunflower");
        System.out.println(Flowers);

        // Updated size
        System.out.println(Flowers.size());

        // Clear all Flowers
        Flowers.clear();
        System.out.println("After clearing: " + Flowers);

        // Confirm empty
        System.out.println("size of the set after clear(): " + Flowers.size());

    }
}
