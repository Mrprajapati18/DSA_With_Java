
import java.util.Scanner;

public class StdAge {
  
  public static void main(String[] args) {
    
    Scanner Scan = new Scanner(System.in);

    int arr[] = new int[5];
    for(int  i = 0; i<arr.length-1; i++) {
      System.out.println("Enter the Age of Student: " + i);
      arr[i] = Scan.nextInt();
    }
    for (int i = 0; i<=arr.length-1; i++) {
      System.out.println("Enter the age of student " + i+ " is " + arr[i] );
      Scan.close();
    }
  }
}
