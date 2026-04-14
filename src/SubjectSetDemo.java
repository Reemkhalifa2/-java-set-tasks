import java.util.*; // Import Set and HashSet

public class SubjectSetDemo {
    public static void main(String[] args) {
        // Declare a Set
        Set<String> subjects = new HashSet<>();

        // Add 5 subject names
        subjects.add("Math");
        subjects.add("Science");
        subjects.add("English");
        subjects.add("History");
        subjects.add("Computer");

        // Display the set
        for(String x : subjects) {System.out.println(x);}

        subjects.add("Arabic");
        System.out.println(subjects);

        // Try to add duplicate
        subjects.add("Arabic");
        System.out.println( subjects);

        System.out.println(subjects.contains("Computer"));

        // Check for element does not exist
        System.out.println(subjects.contains("Art"));

        // Remove an element
        subjects.remove("Computer");
        System.out.println(subjects);

        // Display size
        System.out.println(subjects.size());

        subjects.add("Art");
        System.out.println(subjects);
        System.out.println(subjects.size());

        // Clear the set
        subjects.clear();
        System.out.println(subjects);

        System.out.println(subjects.size());

    }
}