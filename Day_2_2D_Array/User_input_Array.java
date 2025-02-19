import java.util.Scanner;

public class User_input_Array {
  
  public static void main(String[] args) {
    
    Scanner Scan = new Scanner(System.in);

    // Define the dimensions of the Array
    System.out.println("Enter the Number of the rows: ");
    int rows = 5;
    // int rows = Scan.nextInt();
    System.out.println("Enter the number of the Columns:");
    int cols = 6;
    //int cols = Scan.nextInt();

  // Initialize the 2D Array
  int [][] array = new int[rows][cols];

  // Loop through the Array to take user inputs

  for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
          System.out.println("Enter the values for Element [" + i + "][" + j +"]");
          array[i][j] = Scan.nextInt();
      }
  }
  // Display the Array
  System.out.println("The 2D array you entered is:");
  for (int i = 0; i < rows; i++) {
     for(int j = 0; j < cols; j++) {
      System.out.println(array[i][j] + " ");
     }
     // Print for next line 
     System.out.println();
  }
      // Close the Scanner
      Scan.close();
  }
}

