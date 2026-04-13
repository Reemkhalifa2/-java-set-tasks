import java.util.*;        // Step 2: Import Set interface
public class AppSetDemo {
    public static void main(String[] args) {
        Set<String> appName = new HashSet<>();
        appName.add("WhatsApp");
        appName.add("TikTok");
        appName.add("Spotify");
        appName.add("Instagram");
        appName.add("Youtube");
        System.out.println(appName);
        appName.add("TikTok");

        System.out.println(appName);

        System.out.println(appName.contains("Youtube"));
        System.out.println(appName);

        appName.remove("Instagram");

        System.out.println(appName);

        System.out.println(appName.size());

        appName.clear();

        System.out.println(appName);
        System.out.println(appName.size());
    }
}