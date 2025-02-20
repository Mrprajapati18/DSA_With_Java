
import java.util.Scanner;


public class Avg_3D_Array {
  public static void main(String[] args) {
   Scanner Scan = new Scanner(System.in);

   System.out.println("Enetr the number of depth");
   int depth = Scan.nextInt();
   System.out.println("Enter the number of rows");
   int rows = Scan.nextInt();
   System.out.println("Enter the Number of columns");
   int cols = Scan.nextInt();

   // Create the 3D Array
   int array[][][] = new int[depth][rows][cols];

   // populate the Array with user input using loop
   for(int i = 0; i < depth; i++) {
    for(int j = 0; j < rows; j++) {
      for(int k = 0; k < cols; k++) {
        array[i][j][k] = Scan.nextInt();
      }
    }
   }
   // print the 3D Array
   System.out.println("3D Array: ");
   for(int i = 0; i < depth; i++) {
    System.out.println("Layer " + (i + 1) + ": ");
    for(int j = 0; j < rows; j++) {
      for(int k = 0; k < cols; k++) {
       System.out.print(array[i][j][k] + " ");
      }
      System.out.println();
    }
   }
   // Print 3D array and calculate the average of each 3D column
   for(int j = 0; j < rows; j++) {
    for(int k = 0; k < cols; k++) {
      double sum = 0;
      for(int i = 0; i < depth; i++) {
        sum += array[i][j][k];
      }
      double average = sum / depth;
      System.out.println("Average of the column(" + j + "," + k + "): " + average);
    }
   }
   Scan.close();
  }
  
}
