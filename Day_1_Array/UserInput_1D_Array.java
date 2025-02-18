
// Import the Scanner class
import java.util.Scanner;


public class UserInput_1D_Array {
public static void main(String[] args) {
  
  // Create the Scanner Object
  Scanner scanner = new Scanner(System.in);

  // Define the size of Array

// int size = scanner.nextInt();
int size = 5;
// Declare the Array
int array[] = new int[size];

// Take user inputs
for(int i = 0; i < size; i++) {
  System.out.println("Enter the Element " + i + ": ");
  array[i] = scanner.nextInt();
}
// Display the Array Elements
System.out.println("You enter the following elements: ");

for(int i = 0; i < size; i++) {
  System.out.println("Element " + i + ": " + array[i]);
}
// Close the Scanner

scanner.close();
}
}