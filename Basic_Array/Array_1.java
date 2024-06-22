import java.util.*;

public class Array_1
 {
  public static void main(String [] args)
  {
      int marks[ ] = new int[100];
      Scanner sc  = new Scanner(System.in);
      // int phy ;
      // phy = sc.nextInt();

      marks[0] = sc.nextInt(); // phy
      marks[1] = sc.nextInt(); // math
      marks[2] = sc.nextInt(); // chem

      System.out.println("Phy marks:"+marks[0]);
      System.out.println("math marks:"+marks[1]);
      System.out.println("chem marks:"+marks[2]);

      marks[2] =  marks[2]+1;
      System.out.println("Updated marks is :"+ marks[2]); // updated marks

      System.out.println("Array lenght = "+ marks.length+"%");

  }
}