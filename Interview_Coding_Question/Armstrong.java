import java.util.Scanner;

public class Armstrong {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number.");
    int num = sc.nextInt();

    int temp = num;
    int rev = 0;
    int sum = 0;

    while(num > 0) {
        rev = num % 10;
        num = num / 10;
        sum = sum + rev*rev*rev;
    }
    if(temp == sum) {
      System.out.println("Number is Armstrong");
    }
    else {
      System.out.println("Number not Armstrong..");
    }
    sc.close();
  }
}
