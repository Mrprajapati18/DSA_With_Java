import java.util.Scanner;

public class MinimumElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Define array size
        int size = 5; 
        int array[] = new int[size];

        // Populate the array with user input
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {  // Fix: Iterate up to size
            array[i] = scan.nextInt();
        }

        // Initialize the minimum value with the first element of the array
        int min = array[0];

        // Find the minimum value in the array
        for (int i = 1; i < size; i++) {  // Fix: Start loop from index 1
            if (array[i] < min) {
                min = array[i];
            }
        }

        // Print the original array
        System.out.print("Array: [");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]);
            if (i < size - 1) {  // Fix: Avoid extra comma at the end
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // Print the minimum value found in the array
        System.out.println("Minimum value: " + min);

        // Close the scanner
        scan.close();
    }
}
