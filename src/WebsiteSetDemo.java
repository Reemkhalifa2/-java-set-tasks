import java.util.*;

public class WebsiteSetDemo {
    public static void main(String[] args) {

        // create set
        Set<String> websites = new HashSet<>();

        // add websites
        websites.add("google.com");
        websites.add("youtube.com");
        websites.add("facebook.com");
        websites.add("amazon.com");
        websites.add("wikipedia.org");

        // display websites
        System.out.println(websites);

        // add duplicate (no change)
        websites.add("google.com");
        System.out.println(websites);

        // check if exists
        System.out.println(websites.contains("youtube.com"));

        // remove website
        websites.remove("facebook.com");
        System.out.println(websites);

        // display size
        System.out.println(websites.size());

        // clear set
        websites.clear();
        System.out.println(websites);

        // confirm empty
        System.out.println(websites.size());
    }
}