
import java.util.Scanner;

public class Calculate_Array_Sum {
  public static void main(String[] args) {
    
    Scanner Scan = new Scanner(System.in);

    // Create the size of Array
    int number  = 5;
    //int number = Scan.nextInt();

    //  Ask user size and create an array
    int array[] = new int[number];

    // To populate the Array with the user input

    for(int i =0; i<number; i++) {
      array[i] = Scan.nextInt();
    }
    // To find the Average values in the Array
    int sum = 0;
    for(int i = 0; i<number; i++) {
      //sum = sum + array[i];
      sum += array[i];    
    }
    System.out.print("Array: [ ");
    for(int i = 0; i<number; i++) {
      System.out.print(array[i]);
      if(i < number - 1) {
        System.out.print(", ");
      }
    }
    System.out.print("]");
    System.out.println("Sum :" + sum);
    Scan.close();
  }
}
