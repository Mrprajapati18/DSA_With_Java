import java.util.Scanner;

public class Program1_2D_Array {
  public static void main(String[] args) {
    Scanner Scan = new Scanner(System.in);

    // Initialize the 2D Array
    int array[][] = new int[3][4];

  // Loop through the Array to take user inputs
  for(int i = 0; i < 3; i++) {
    for(int j = 0; j < 4; j++) {
      array[i][j] = Scan.nextInt();
    }
  }
  Scan.close();
  // Display the Array
  System.out.println("Array:");
  for(int i = 0; i < 3; i++){
    for(int j = 0; j < 4; j++) {
      System.out.print(array[i][j]);
      System.out.print(" ");
    }
    // Move to the nex rows
    System.out.println(); 
  }
  }
} 
