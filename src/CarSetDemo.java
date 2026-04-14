import java.util.*; // Import Set and HashSet

public class CarSetDemo {
    public static void main(String[] args) {

        // Declare a Set
        Set<String> Cars = new HashSet<>();

        // Add 5 car names
        Cars.add("Ford");
        Cars.add("Chevrolet");
        Cars.add("Tesla");
        Cars.add("Nissan");
        Cars.add("Honda");

        // Display initial employees
        for(String car : Cars) {System.out.println(car);}

        Cars.add("Kia");
        System.out.println(Cars);

        // Try to add duplicate
        Cars.add("Honda");
        System.out.println( Cars);


        System.out.println(Cars.contains("Honda"));

        // Check for element does not exist
        System.out.println(Cars.contains("Jaguar"));

        // Remove an element
        Cars.remove("Honda");
        System.out.println(Cars);

        // Display size
        System.out.println(Cars.size());

        Cars.add("Lexus");
        System.out.println(Cars);
        System.out.println(Cars.size());

        // Clear all employees
        Cars.clear();
        System.out.println(Cars);

        System.out.println(Cars.size());

    }
}