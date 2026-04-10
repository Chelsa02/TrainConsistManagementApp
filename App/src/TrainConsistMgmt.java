import java.util.ArrayList;
import java.util.List;

/**
 * ===============================================================
 * MAIN CLASS - TrainConsistMgmt
 * ===============================================================
 *
 * Use Case 2: Add Passenger Bogies to Train
 */
public class TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("UC2 - Add Passenger Bogies to Train");
        System.out.println("========================================\n");

        // Create an ArrayList to hold passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // ---- CREATE (Add bogies) ----
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("After Adding Bogies:");
        System.out.println("Passenger Bogies : " + passengerBogies);

        // ---- DELETE (Remove bogie) ----
        passengerBogies.remove("AC Chair");

        System.out.println("\nAfter Removing 'AC Chair':");
        System.out.println("Passenger Bogies : " + passengerBogies);

        // ---- READ (Check existence) ----
        System.out.println("\nChecking if 'Sleeper' exists:");
        boolean exists = passengerBogies.contains("Sleeper");
        System.out.println("Contains Sleeper?: " + exists);

        // ---- Final Consist ----
        System.out.println("\nFinal Train Passenger Consist:");
        System.out.println(passengerBogies);

        System.out.println("\nUC2 operations completed successfully...");
    }
}