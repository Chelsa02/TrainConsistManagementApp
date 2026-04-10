import java.util.*;
import java.util.stream.*;

public class PerformanceComparisonApp {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("UC13 - Loop vs Stream Performance");
        System.out.println("========================================\n");

        // ---- Create large dataset ----
        List<PassengerBogie> bogies = new ArrayList<>();

        for (int i = 1; i <= 100000; i++) {
            bogies.add(new PassengerBogie("Bogie-" + i, (i % 100) + 1));
        }

        // =========================================================
        // 🔹 LOOP-BASED FILTERING
        // =========================================================
        long startLoop = System.nanoTime();

        List<PassengerBogie> loopResult = new ArrayList<>();
        for (PassengerBogie b : bogies) {
            if (b.getCapacity() > 60) {
                loopResult.add(b);
            }
        }

        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        // =========================================================
        // 🔹 STREAM-BASED FILTERING
        // =========================================================
        long startStream = System.nanoTime();

        List<PassengerBogie> streamResult = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        // =========================================================
        // 🔹 OUTPUT
        // =========================================================
        System.out.println("Loop Result Size   : " + loopResult.size());
        System.out.println("Stream Result Size : " + streamResult.size());

        System.out.println("\nExecution Time:");
        System.out.println("Loop Time   : " + loopTime + " ns");
        System.out.println("Stream Time : " + streamTime + " ns");

        // Consistency Check
        System.out.println("\nResults Match? " + (loopResult.size() == streamResult.size()));

        System.out.println("\nUC13 operations completed successfully...");
    }
}