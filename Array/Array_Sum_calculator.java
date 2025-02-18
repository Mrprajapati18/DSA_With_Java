
import java.util.Scanner;
/* 
WAP javva program to create a 1D array of integer
1. Create 1 D array inters with size of 5.
2. pupulate the array with user-input values
3. Calculate the sum of all element in the Array
4. Print the Orignal array and sum.
*/
public class Array_Sum_calculator {
  
  public static void main(String[] args) {
    Scanner Scan = new Scanner(System.in);

    int array[] = new int[5];

  for (int i = 0; i < array.length; i++) {
      array[i] = Scan.nextInt();

  }
  int sum = 0;
  for (int i = 0; i < array.length; i++) {
     sum += array[i]; 
  }
  System.out.print("Array: [");
  for(int i = 0; i<array.length; i++) {
    System.out.print(array[i]);
    if (i < array.length - 1) {
      System.out.print(", ");
    }
  }
  System.out.print("]");
  System.out.println("sum: " + sum);
  Scan.close();
  }
}
