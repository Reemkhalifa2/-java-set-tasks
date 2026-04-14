import java.util.*;

public class EmpSetDemo {
    public static void main(String[] args) {

        // Declare a Set
        Set<String> employees = new HashSet<>();

        // Add 5 employee names
        employees.add("Reem");
        employees.add("Sara");
        employees.add("Sama");
        employees.add("Noor");
        employees.add("Nasser");

        // Display initial employees
        for(String emp : employees) {System.out.println(emp);}

        employees.add("Ahmed");
        System.out.println(employees);

        // Try to add duplicate
        employees.add("Ahmed");
        System.out.println( employees);


        System.out.println(employees.contains("Sara"));

        // Check for element does not exist
        System.out.println(employees.contains("Ali"));

        // Remove an element
        employees.remove("Noor");
        System.out.println(employees);

        // Display size
        System.out.println(employees.size());

        employees.add("Layla");
        System.out.println(employees);
        System.out.println(employees.size());

        // Clear all employees
        employees.clear();
        System.out.println(employees);

        System.out.println(employees.size());

    }
}