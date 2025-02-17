
import java.util.Scanner;

public class StdMarks {
  
  public static void main(String[] args) {
    int marks[] = new int[100];
    Scanner sc = new Scanner(System.in);

    marks[0] = sc.nextInt();
    marks[1] = sc.nextInt();
    marks[2] = sc.nextInt();
    
    marks[2] = marks[2] + 1; //  updated marks

    System.out.println("Physics Marks :" + marks[0]);
    System.out.println("Chemestry Marks: " + marks[1]);
    System.out.println("English marks: " + marks[2]);
    
  }
}
