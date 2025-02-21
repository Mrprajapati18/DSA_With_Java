import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        System.out.println("Enter a string to reverse");
        String str1 = Scan.nextLine();

        char arr[] = str1.toCharArray(); // Convert string to char array
        char arr2[] = new char[arr.length]; // Create an empty array of the same length

        // Reversing the characters
        int j = arr.length - 1; // Index for reversed array
        for (int i = 0; i < arr.length; i++) {
            arr2[j] = arr[i]; // Assign characters in reverse order
            j--; // Move to the previous position in arr2
        }

        // Convert reversed character array back to string
        str1 = new String(arr2);
        System.out.println("Reverse string is: " + str1);
        
        Scan.close(); // Close scanner to prevent memory leaks
    }
}
