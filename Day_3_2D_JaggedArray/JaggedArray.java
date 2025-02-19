import java.util.Scanner;

public class JaggedArray {
  public static void main(String[] args) {
    
    Scanner Scan = new Scanner(System.in);
    System.out.println("Enter Number of classes");
    // Initialize the 2D Array
    int Array[][] = new int[Scan.nextInt()][];

    // Ask user input array create 
    for(int i = 0; i < Array.length; i++) {
      System.out.println("Enter Number of Students in Class : " + i);
      Array[i] = new int[Scan.nextInt()];
    }
    for(int i = 0; i < Array.length-1; i++) {
      for(int j = 0; j < Array[i].length; j++) {
        System.out.println("Enter age of class : " + i + " Student: " + j);
        Array[i][j] = Scan.nextInt();
      }
    }
    System.out.println("Array contents Are....");
  
    for(int i = 0; i < Array.length-1; i++) {
      for(int j = 0; j < Array[i].length; j++) {
        System.out.print(Array[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println("===================================");
  }
}
