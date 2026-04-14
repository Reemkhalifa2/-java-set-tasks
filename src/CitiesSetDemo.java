import java.util.*; // Import Set and HashSet classes

public class CitiesSetDemo {
    public static void main(String[] args) {
        // Declare a Set
        Set<String> cities = new HashSet<>();

        // Add 5 city names to the Set
        cities.add("Muscat");
        cities.add("Nizwa");
        cities.add("Salalah");
        cities.add("Sohar");
        cities.add("Bahla");

        // Display the Set
        System.out.println( cities);

        // Add one more city
        cities.add("Ibri");
        System.out.println(cities);

        // Try to add a duplicate
        cities.add("Muscat");
        System.out.println(cities);//Set does not allow duplicate values

        // Check if element exists
        System.out.println(cities.contains("Salalah"));

        // Check for element that does NOT exist
        System.out.println(cities.contains("Seeb"));

        // Remove a element
        cities.remove("Sur");
        System.out.println(cities);

        cities.remove("Sohar");
        System.out.println(cities);

        // Display the size of the Set
        System.out.println(cities.size());

        cities.add("Izki");
        System.out.println( cities);

        System.out.println(cities.size());

        // Clear all elements
        cities.clear();
        System.out.println(cities);//After clearing the set

        System.out.println(cities.size());

    }
}