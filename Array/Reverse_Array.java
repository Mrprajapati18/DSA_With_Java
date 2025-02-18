import java.util.Scanner;

public class Reverse_Array {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        // Define the array size
        int size = 5;
        int array[] = new int[size];

        // To populate the array with user input
        for (int i = 0; i < size; i++) {
            array[i] = Scan.nextInt();
        }

        // Print the original Array
        System.out.print("Original Array: ");
        printArray(array);

        // Reverse the array
        ReverseArray(array);

        // Print the reversed array
        System.out.print("Reverse Array: ");
        printArray(array);

        Scan.close();
    }

    private static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    private static void ReverseArray(int[] array) {
        int left = 0, right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            // Move towards the middle
            left++;
            right--;
        }
    }
}
