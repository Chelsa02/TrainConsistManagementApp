import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * ===============================================================
 * CLASS - Bogie
 * ===============================================================
 * Represents a passenger bogie with name and capacity
 */
class Bogie {
    String name;
    int capacity;

    // Constructor
    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // toString method for printing
    @Override
    public String toString() {
        return name + " (" + capacity + " seats)";
    }
}

/**
 * ===============================================================
 * MAIN CLASS - SortBogiesByCapacity
 * ===============================================================
 *
 * Use Case 7: Sort Bogies by Capacity
 */
public class SortBogiesByCapacity {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("UC7 - Sort Bogies by Capacity");
        System.out.println("========================================\n");

        // Create a list of Bogie objects
        List<Bogie> bogies = new ArrayList<>();

        // ---- Add bogies ----
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        System.out.println("Before Sorting:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // ---- Sort using Comparator (ascending order of capacity) ----
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("\nAfter Sorting (by Capacity - Ascending):");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        System.out.println("\nUC7 operations completed successfully...");
    }
}