import java.util.*;
public class CheckSetDemo {
    public static void main(String[] args) {
        Set<String> employeeID= new HashSet<>();
        employeeID.add("emp1");
        employeeID.add("emp2");
        employeeID.add("emp3");
        employeeID.add("emp4");
        employeeID.add("emp5");
        for(String id: employeeID){
            System.out.println(id);
        }
        System.out.println(employeeID.contains("emp1"));
        System.out.println(employeeID.contains("emp7"));
    }
}
