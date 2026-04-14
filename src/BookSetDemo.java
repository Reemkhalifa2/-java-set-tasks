import java.util.*;
public class BookSetDemo {
    public static void main(String[] args) {
        Set<String> bookTitles = new HashSet<>();
        bookTitles.add("The Silent Patient");
        bookTitles.add("Project Hail Mary");
        bookTitles.add("It Ends with Us");
        bookTitles.add("The Correspondent");
        bookTitles.add("Jane Eyre");
        System.out.println(bookTitles);
        bookTitles.add("Jane Eyre");

        System.out.println(bookTitles);

        System.out.println(bookTitles.remove("Jane Eyre"));

        bookTitles.remove("Data Structures");

        System.out.println(bookTitles);

        System.out.println(bookTitles.size());

        bookTitles.clear();

        System.out.println(bookTitles);

        System.out.println(bookTitles.size());
    }
}