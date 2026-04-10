import java.util.LinkedList;

/**
 * ===============================================================
 * MAIN CLASS - OrderedBogieIDs
 * ===============================================================
 *
 * Use Case 4: Maintain Ordered Bogie IDs using LinkedList
 */
public class OrderedBogieIDs {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("UC4 - Maintain Ordered Bogie IDs");
        System.out.println("========================================\n");

        // Create a LinkedList to represent train consist
        LinkedList<String> train = new LinkedList<>();

        // ---- Add bogies ----
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(train);

        // ---- Insert Pantry Car at position 2 ----
        train.add(2, "Pantry");

        System.out.println("\nAfter Adding Pantry Car at position 2:");
        System.out.println(train);

        // ---- Remove first and last bogie ----
        train.removeFirst();
        train.removeLast();

        System.out.println("\nAfter Removing First and Last Bogie:");
        System.out.println(train);

        // ---- Final Consist ----
        System.out.println("\nFinal Ordered Train Consist:");
        System.out.println(train);

        System.out.println("\nUC4 operations completed successfully...");
    }
}
