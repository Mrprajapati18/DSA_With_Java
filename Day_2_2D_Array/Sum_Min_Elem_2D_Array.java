import java.util.Scanner;

public class Sum_Min_Elem_2D_Array {
  
  public static void main(String[] args) {
    
    Scanner Scan = new Scanner(System.in);
    System.out.println("Enter the rows");
   int rows = Scan.nextInt();
   System.out.println("Enetr the number of Columns");
   int cols = Scan.nextInt();
    // Ask user for array dimensions and create the 2D Array
    
    int array[][] = new int[rows][cols];
    System.out.println("Enter the Array data to store");
   // Loop throught for user input
    for (int i = 0; i < rows; i++) {
        for(int j = 0; j < cols; j++) {
          array[i][j] = Scan.nextInt();
        }
    }
    // Display the Array
    System.out.println("Array :");
    for(int i = 0; i < rows; i++) {
      for(int j = 0 ; j < cols; j++) {
        System.out.print(array[i][j] + " ");
      }
      System.out.println();
    }
    // Calculate the minimum Array element of each rows
    int sumOfMinElement = 0;
    for(int i = 0; i < rows; i++) {
      int minInRow = array[i][0];
      for(int j = 0; j < cols; j++) {
        if(array[i][0] < minInRow) { 
         minInRow = array[i][0];
      }
    }
    System.out.println("Minimum of row " + minInRow);
    sumOfMinElement += minInRow;
  }
  System.out.println("Sum of the Minimum Elements: " + sumOfMinElement);
  Scan.close();
  }
}
