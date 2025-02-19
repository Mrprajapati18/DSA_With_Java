
import java.util.Scanner;

public class Transpose_Matrix {
  public static void main(String[] args) {
  Scanner Scan = new Scanner(System.in);
  
  System.out.println("Enter the number of rows");
  int rows = Scan.nextInt();
  System.out.println("Enter the number of columns");
  int cols = Scan.nextInt();

  int [][] matrix = new int[rows][cols];
  System.out.println("Enter the elements of the matrix: ");
  // Ask user for matrix dimensions and create the 2D Array
  for(int i = 0; i < rows; i++) {
    for(int j = 0; j < cols; j++) {
      matrix[i][j] = Scan.nextInt();
    }
  }
  // Transpose of the matrix with swapped dimensions
  int [][] transpose = new int[cols][rows];
   
  // Transposing the matrix;

  for(int i = 0; i < rows; i++) {
    for(int j = 0; j < cols; j++) {
      transpose[j][i] = matrix[i][j];
    }
  }
  // Print the original Array
  System.out.println("Original Matrix :");
  for(int i = 0; i < rows; i++) {
    for(int j = 0; j < cols; j++) {
      System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
  }
  System.out.println("\nTranspose Matrix");
  // // Printing the transposed matrix
  
  for(int i = 0; i < cols; i++) {
    for(int j = 0; j < rows; j++) {
      System.out.print(transpose[i][j] + " ");
    }
    System.out.println();
   } 
   Scan.close();
  }
}