
import java.util.Scanner;

public class primeNumber {
  public static void main(String[] args) {
    
    Scanner Sc = new  Scanner(System.in);
    int num = Sc.nextInt();

    if(num < 2) {
      System.out.println(num + "is not a prime number");
    }
    boolean isPrime = true;
    for(int i = 2; i <= Math.sqrt(num); i++) {
      if(num%i == 0) {
        isPrime = false;
        break;
      }

    }
    if(isPrime) {
      System.out.println(num + " is a prime number");
    }
    else {
      System.out.println(num + " is not a prime number");
    }
  }
  
}
