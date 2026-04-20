public class UC20 {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("UC20 - Exception Handling in Search");
        System.out.println("========================================\n");

        // 🔹 Create bogie array (TRY EMPTY CASE ALSO)
        String[] bogieIds = {};   // ❗ Empty array to trigger exception

        // 🔹 Search key
        String key = "BG101";

        try {
            // 🔹 VALIDATION (Fail-Fast)
            if (bogieIds.length == 0) {
                throw new IllegalStateException("No bogies available in train. Cannot perform search.");
            }

            // 🔹 LINEAR SEARCH (can also use binary search)
            boolean found = false;

            for (String id : bogieIds) {
                if (id.equals(key)) {
                    found = true;
                    break;
                }
            }

            // 🔹 Display result
            if (found) {
                System.out.println("Bogie " + key + " found in train consist.");
            } else {
                System.out.println("Bogie " + key + " NOT found in train consist.");
            }

        } catch (IllegalStateException e) {
            // 🔹 Handle exception
            System.out.println("ERROR: " + e.getMessage());
        }

        System.out.println("\nUC20 operation completed...");
    }
}