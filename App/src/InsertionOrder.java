import java.util.LinkedHashSet;
import java.util.Set;

/**
 * ===============================================================
 * MAIN CLASS - InsertionOrder
 * ===============================================================
 *
 * Use Case 5: Preserve Insertion Order of Bogies
 */
public class InsertionOrder {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("UC5 - Preserve Insertion Order of Bogies");
        System.out.println("========================================\n");

        // Create LinkedHashSet to maintain order + uniqueness
        Set<String> trainFormation = new LinkedHashSet<>();

        // ---- Add bogies ----
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // ---- Add duplicate ----
        trainFormation.add("Sleeper"); // duplicate (ignored)

        // ---- Display final formation ----
        System.out.println("Final Train Formation (No duplicates, ordered):");
        System.out.println(trainFormation);

        System.out.println("\nUC5 operations completed successfully...");
    }
}