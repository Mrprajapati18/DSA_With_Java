
import java.util.Scanner;

public class Max_Element {
  public static void main(String[] args) {
    Scanner Scan = new Scanner(System.in);
    
    // Ask user size and create an array
    int size = 5;
    //int size = Scan.nextInt();
    int array[] = new int [size];

    // populate the array with user input
    for(int i = 0; i< size; i++) {
      array[i] = Scan.nextInt();
    }

    // To find the maximum values in the Array

    int max = array[0];
    for(int i = 0; i < size; i++) {
      if(array[i] > max) {
        max = array[i];
      }
    }
    System.out.print("Array: [");
    for(int i=0; i<size; i++) {
      System.out.print(array[i]);
      if(i < size -1) {
        System.out.print(", ");
      }
    }
    System.out.print("]");
    System.out.println(" ");
    System.out.print("Maximum values: " + max);
    Scan.close();
  }
}
