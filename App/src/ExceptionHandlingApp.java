import java.util.*;

public class ExceptionHandlingApp {

    public static void main(String[] args) {

        System.out.println("UC14 - Custom Exception Handling\n");

        //  CREATE LIST HERE
        List<PassengerBogie> bogies = new ArrayList<>();

        // ADD BOGIES WITH TRY-CATCH
        try {
            bogies.add(new PassengerBogie("Sleeper", 72));
        } catch (InvalidCapacityException e) {
            System.out.println(e.getMessage());
        }

        try {
            bogies.add(new PassengerBogie("AC Chair", -10));
        } catch (InvalidCapacityException e) {
            System.out.println(e.getMessage());
        }
        try {
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            PassengerBogie b2 = new PassengerBogie("AC Chair", -10); // invalid
        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }
        // ✅ DISPLAY VALID BOGIES
        System.out.println("\nValid Bogies:");
        for (PassengerBogie b : bogies) {
            System.out.println(b);
        }
    }
}