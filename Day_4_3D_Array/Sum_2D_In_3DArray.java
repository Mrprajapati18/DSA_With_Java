import java.util.Scanner;

public class Sum_2D_In_3DArray {

  public static void main(String[] args) {
    
    Scanner Scan = new Scanner(System.in);
    System.out.println("Enter the number of depth: ");
    int depth = Scan.nextInt();
    System.out.println("Enter the number of rows: ");
    int rows = Scan.nextInt();
    System.out.println("Enter the number of cols: ");
    int cols = Scan.nextInt();
    // Create 3D array
    int array[][][] = new int[depth][rows][cols];
    System.out.println("Enter the elements of the 3D Array");
    // Populate the Array with user input
    for(int i = 0; i < depth; i++) {
      for(int j = 0; j < rows; j++) {
        for(int k = 0; k < cols; k++) {
          array[i][j][k] = Scan.nextInt();
        }
      }
    }
    // Display the 3D Array
    System.out.println("3D Array: ");
    for(int i = 0; i < depth; i++) {
      System.out.println("Layer " + (i + 1) + ": ");
      for(int j = 0; j < rows; j++) {
        for(int k = 0; k < cols; k ++){
        System.out.print(array[i][j][k] + " ");
        }
        System.out.println();
      }
    }
    // Calculate and print the each 2D Array
    for(int i = 0; i < depth; i++) {
      int sum = 0;
      for(int j = 0; j < rows; j++) {
        for(int k = 0; k < cols; k++) {
          sum += array[i][j][k];
        }
      }
      System.out.println("Sum Of the layer " + (i + 1) + ": " + sum);
    }
    Scan.close();
  }
}
