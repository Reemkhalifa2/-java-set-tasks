import java.util.*;
public class CourseSetDemo {
    public static void main(String[] args) {
        Set<String> courses = new HashSet<>();
        courses.add("Java Programming");
        courses.add("Web Development");
        courses.add("Database");
        courses.add("Web Design");
        courses.add("Python");
        // Print all elements in the Set
        System.out.println(courses);
        courses.add("Networking");
        //add duplicate element
        courses.add("Python");
        //the duplicate value is not stored again because a Set
        //allows only unique elements
        System.out.println(courses);

        System.out.println(courses.contains("Python"));// check for another course name that does not exist in the set
        System.out.println(courses.contains("Data Analysis"));// check for another course name that does not exist in the set

        //Use the remove() method to delete one existing element
        courses.remove("Database");
        System.out.println(courses);
        courses.remove("Python");
        //Display the size of the set
        System.out.println(courses.size());
        courses.add("Compute Architecture");

        System.out.println(courses);
        System.out.println(courses.size());

        courses.clear();
        System.out.println(courses);

        System.out.println("the set now contains zero elements "+courses.size());
    }
}