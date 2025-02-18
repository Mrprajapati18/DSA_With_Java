
import java.util.Scanner;

// WAP to store the Student name in an Array
public class StdName {
  public static void main(String[] args) {
    Scanner Scan = new Scanner(System.in);

    String arr[] = new String[5];

   for(int i = 0; i <= arr.length - 1; i++) {
    System.out.println("Enter the name of Student : " + i);
    arr[i] = Scan.next();
    
   }
    for(int i = 0; i <= arr.length - 1; i++) {
      System.out.println("Array element is " + arr[i]);
      Scan.close();
    }
  }
}
