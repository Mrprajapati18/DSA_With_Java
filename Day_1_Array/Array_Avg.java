import java.util.Scanner;

public class Array_Avg {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Define the array size (User can uncomment to take input)
        int size = 5;
        // System.out.print("Enter array size: ");
        // int size = scan.nextInt();

        int array[] = new int[size];

        // Taking user input for the array
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }

        // Calculate the sum and average
        double sum = 0;
      for(int i=0; i< size -1; i++) {
        sum += array[i];
      }
        double average = sum / size;

        // Print the original array
        System.out.print("Array: [");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]);
            if (i < size - 1) {
                System.out.print(", "); // Proper formatting
            }
        }
        System.out.println("]");

        // Print the average
        System.out.println("Average: " + average);

        scan.close();
    }
}
