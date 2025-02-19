import java.util.Scanner;

public class Bank_Customer {
  
  public static void main(String[] args) {
    
    Scanner Scan = new Scanner(System.in);
    
    // Initialize the Array
    String [][]array = new String[Scan.nextInt()][Scan.nextInt()];

    // Loop throught for user input
    System.out.println("Enter Data to store in Array");
    for(int i = 0; i<=array.length-1; i++) {
      for(int j = 0; j <= array.length-1; j++) {
        System.out.println("Enter the Name of Bank : " + i + " Customer: " + j);
        array[i][j] = Scan.next();
      }
    }
    System.out.println("Array Contents Are....");
    for(int i=0; i <= array.length-1; i++) {
      for(int j = 0; j <= array.length-1; j++) {
        System.out.print(array[i][j] + " ");
      }
      System.out.println();
    }
    Scan.close();
  }
}
