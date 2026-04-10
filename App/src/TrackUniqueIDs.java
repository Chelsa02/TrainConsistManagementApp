import java.util.HashSet;
import java.util.Set;

/**
 * ===============================================================
 * MAIN CLASS - TrackUniqueIDs
 * ===============================================================
 *
 * Use Case 3: Track Unique Bogie IDs
 */
public class TrackUniqueIDs {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("UC3 - Track Unique Bogie IDs");
        System.out.println("========================================\n");

        // Create a HashSet to store unique bogie IDs
        Set<String> bogieIDs = new HashSet<>();

        // ---- ADD IDs (including duplicates) ----
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101"); // duplicate
        bogieIDs.add("BG102"); // duplicate

        // Display final unique bogie IDs
        System.out.println("Bogie IDs after insertion (duplicates ignored):");
        System.out.println(bogieIDs);

        System.out.println("\nTotal Unique Bogie IDs: " + bogieIDs.size());

        System.out.println("\nUC3 operations completed successfully...");
    }
}