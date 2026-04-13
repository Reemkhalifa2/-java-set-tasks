import java.util.*;
public class SizeSetDemo {
    public static void main(String[] args) {
        Set<String> deptName = new HashSet<>();
        deptName.add("It");
        deptName.add("Engineering");
        deptName.add("Legal");
        deptName.add("Projects");
        deptName.add("Finance");
        for(String dept : deptName){
            System.out.println(dept);
        }
        System.out.println(deptName.size());
        deptName.add("Marketing");
        System.out.println(deptName.size());//size of the element increased

    }
}
