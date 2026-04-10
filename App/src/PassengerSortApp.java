import java.util.*;

public class PassengerSortApp {

    // 🔹 Bubble Sort Method
    public static void bubbleSort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                // Compare adjacent elements
                if (arr[j] > arr[j + 1]) {

                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("UC16 - Bubble Sort (Passenger Capacity)");
        System.out.println("========================================\n");

        // 🔹 Input: Passenger Bogie Capacities
        int[] capacities = {72, 56, 24, 70, 60};

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(capacities));

        // 🔹 Call Bubble Sort
        bubbleSort(capacities);

        System.out.println("\nAfter Sorting:");
        System.out.println(Arrays.toString(capacities));

        System.out.println("\nUC16 operations completed...");
    }
}