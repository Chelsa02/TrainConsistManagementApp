import java.util.Arrays;

public class UC19 {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("UC19 - Binary Search for Bogie ID");
        System.out.println("========================================\n");

        // Create array of bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        //  Ensure data is sorted (IMPORTANT for Binary Search)
        Arrays.sort(bogieIds);

        //  Search key
        String key = "BG309";

        //  Display sorted bogies
        System.out.println("Sorted Bogie IDs:");
        for (String id : bogieIds) {
            System.out.println(id);
        }

        //  BINARY SEARCH LOGIC
        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;

            int comparison = key.compareTo(bogieIds[mid]);

            if (comparison == 0) {
                found = true;
                break; //  Found
            }
            else if (comparison < 0) {
                high = mid - 1; //  Search left
            }
            else {
                low = mid + 1;  //  Search right
            }
        }

        //  Display result
        if (found) {
            System.out.println("\nBogie " + key + " found using Binary Search.");
        } else {
            System.out.println("\nBogie " + key + " NOT found.");
        }

        System.out.println("\nUC19 search completed...");
    }
}