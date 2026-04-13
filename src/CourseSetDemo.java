import java.util.*;        // Step 2: Import Set interface
public class CourseSetDemo {
    public static void main(String[] args) {
        Set<String> courses = new HashSet<>();
        courses.add("Java Programming");
        courses.add("Web Development");
        courses.add("Data Structures");
        courses.add("Database Systems");
        courses.add("Python");
        System.out.println(courses);
        courses.add("Java Programming");

        System.out.println(courses);

        System.out.println(courses.contains("Web Development"));

        courses.remove("Data Structures");

        System.out.println(courses);

        System.out.println(courses.size());

        courses.clear();

        System.out.println(courses);

        System.out.println(courses.size());
    }
}