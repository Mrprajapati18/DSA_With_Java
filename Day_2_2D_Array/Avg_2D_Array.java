import java.util.Scanner;

public class Avg_2D_Array {
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
  // Print the array
  System.out.println("Array :");
  for(int i = 0; i < 3; i++) {
    for(int j = 0; j < 4; j++) {
     System.out.print(array[i][j] + " ");
    }
    System.out.println();
  }
  // calculate and print the average of each rows
  for (int i = 0; i < 3; i++) {
    int sum = 0;
      for (int j = 0; j < 4; j++) {
          sum += array[i][j];
      }
       double average = (double) sum / 4;
       System.out.println("Average of the row " + (i + 1) + ": " + average);
    }
    Scan.close();
  }
  
}
