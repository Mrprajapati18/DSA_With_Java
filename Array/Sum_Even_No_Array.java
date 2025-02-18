
import java.util.Scanner;

public class Sum_Even_No_Array {
  
  public static void main(String[] args) {
    
    Scanner Scan = new Scanner(System.in);

    // Ask user for Array  size and create the Array
    int size  = 6;
    int arr[]  = new int[size];

    // Populate the array with user input
    for (int i = 0; i < size; i++) {
        arr[i] = Scan.nextInt();
    }
    int evenSum = 0;

    // Calculate the sum of even numbers
    for(int i = 0; i < size; i++) {
      // if(arr[i] % 2 != 0) { // Sum of odd number
      if(arr[i] % 2 == 0) {  // Sum of Even number
         evenSum += arr[i];
      }      
    }
    System.out.print("Array :[");

    // print the Original Array and sum of even numbers
    for (int i = 0; i < size; i++) {
        System.out.print(arr[i]);
        if( i < size - 1) {
          System.err.print(", ");
        }
    }
    System.out.print("]");
    System.out.println("");
    System.out.println("Sum of even Numbers " + evenSum);
    Scan.close();
  }
}
