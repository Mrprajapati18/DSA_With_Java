import java.util.Scanner;

public class Sum_2D_In_3DArray {

  public static void main(String[] args) {
    
    Scanner Scan = new Scanner(System.in);
    int depth = Scan.nextInt();
    int rows = Scan.nextInt();
    int cols = Scan.nextInt();
    // Create 3D array
    int array[][][] = new int[depth][rows][cols];

    // Populate the Array with user input
    for(int i = 0; i < depth; i++) {
      for(int j = 0; j < rows; j++) {
        for(int k = 0; k < cols; k++) {
          array[i][j][k] = Scan.nextInt();
        }
      }
    }
  }
}
