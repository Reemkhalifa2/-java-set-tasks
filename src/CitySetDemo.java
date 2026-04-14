import java.util.*;
public class CitySetDemo {
    public static void main(String[] args) {
        Set<String> cityNames = new HashSet<>();
        cityNames.add("Muscat");
        cityNames.add("Dubai");
        cityNames.add("New york");
        cityNames.add("Riyadh");
        cityNames.add("London");
        for(String city : cityNames){
            System.out.print(city+", ");
        }
        cityNames.add("London");//add one duplicate
        System.out.println("After adding a duplicate");
        for(String city : cityNames){
            System.out.print(city+", ");
        }
        System.out.println(cityNames.contains("Nizwa"));
        cityNames.remove("New york");
        for(String city : cityNames){
            System.out.print(city+", ");
        }
        System.out.println(cityNames.size());
        cityNames.clear();
        //display after clearing the set
        System.out.println("After using clear()");
        for(String city : cityNames){
            System.out.print(city+", ");
        }
        System.out.println(cityNames.size());


    }
}
