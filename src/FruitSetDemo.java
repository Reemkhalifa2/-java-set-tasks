import java.util.*; // Import Set and HashSet

public class FruitSetDemo{
public static void main(String[] args) {

    // Declare Set
    Set<String> Fruits = new HashSet<>();

    Fruits.add("Apple");
    Fruits.add("Orange");
    Fruits.add("Grape");
    Fruits.add("Berry");
    Fruits.add("Mango");

    // Display set
    for(String x : Fruits){
        System.out.println(x);
    }
    // Add one more element
    Fruits.add("Strawberry");
    System.out.println(Fruits);

    // Try adding duplicate
    Fruits.add("Apple");
    System.out.println("After adding a duplicate: " + Fruits);


    // check element that does exist
    System.out.println("is Orange in the set: " + Fruits.contains("Orange"));

    // check element that does not exist
    System.out.println("is Rose Berry in the set " + Fruits.contains("Rose Berry"));

    // Remove existing animal
    Fruits.remove("Orange");
    System.out.println(Fruits);


    // Display size
    System.out.println(Fruits.size());


    // Updated size
    System.out.println(Fruits.size());

    // Clear all Fruits
    Fruits.clear();
    System.out.println("After clearing: " + Fruits);

    // Confirm empty
    System.out.println("size of the set after clear(): " + Fruits.size());

}
}
