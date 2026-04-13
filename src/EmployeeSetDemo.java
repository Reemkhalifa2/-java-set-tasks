import java.util.*;
public class EmployeeSetDemo {
    public static void main(String[] args) {
        Set<String> employeeID= new HashSet<>();
        employeeID.add("emp1");
        employeeID.add("emp2");
        employeeID.add("emp3");
        employeeID.add("emp4");
        employeeID.add("emp5");//add elements to set
        for(String id: employeeID){
            System.out.println(id);
        }
        employeeID.add("emp6");
        for(String id: employeeID){
            System.out.println(id);
        }
        System.out.println(employeeID.contains("emp1"));
        employeeID.remove("emp1");//remove elements from set
        for(String id: employeeID){
            System.out.println(id);
        }
        System.out.println(employeeID.size());//get the size of the set(how many elements
        employeeID.clear();
        System.out.println("After clearing set");
        for(String id: employeeID){
            System.out.println(id);
        }
        System.out.println(employeeID.size());

    }
}
