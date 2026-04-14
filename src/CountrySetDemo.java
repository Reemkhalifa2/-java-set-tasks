import java.util.*; // Import Set and HashSet

public class CountrySetDemo {
    public static void main(String[] args) {
        // Declare a Set
        Set<String> Countries = new HashSet<>();

        // Add 5 subject names
        Countries.add("Oman");
        Countries.add("UAE");
        Countries.add("KSA");
        Countries.add("Egypt");
        Countries.add("Qatar");

        // Display the set
        for(String x : Countries) {System.out.println(x);}

        Countries.add("Kuwait");
        System.out.println(Countries);

        // Try to add duplicate
        Countries.add("Qatar");
        System.out.println( Countries);

        System.out.println(Countries.contains("Oman"));

        // Check for element does not exist
        System.out.println(Countries.contains("Bahrain"));

        // Remove an element
        Countries.remove("Egypt");
        System.out.println(Countries);

        // Display size
        System.out.println(Countries.size());

        Countries.add("Bahrain");
        System.out.println(Countries);
        System.out.println(Countries.size());

        // Clear the set
        Countries.clear();
        System.out.println(Countries);

        System.out.println(Countries.size());

    }
}