import java.util.*;

public class MovieSetDemo {
    public static void main(String[] args) {

        Set<String> movieNames = new HashSet<>();

        // add movies
        movieNames.add("The Godfather ");
        movieNames.add("The Shawshank Redemption");
        movieNames.add("The Dark Knight");
        movieNames.add("Schindler's List");
        movieNames.add("Angry Men");

        System.out.println(movieNames);

        // duplicate (no change)
        movieNames.add("Angry Men");
        System.out.println(movieNames);

        // check element
        System.out.println(movieNames.contains("Youtube"));

        // remove (not found)
        movieNames.remove("Instagram");
        System.out.println(movieNames);

        // size
        System.out.println(movieNames.size());

        // clear
        movieNames.clear();
        System.out.println(movieNames);
        System.out.println(movieNames.size());
    }
}