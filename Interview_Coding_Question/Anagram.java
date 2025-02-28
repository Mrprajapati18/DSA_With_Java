
import java.util.Arrays;

public class Anagram {
  
  public static void main(String[] args) {
    
    String str1 = "Amit";
    String str2 = "Atim";

    // To convert String to character
    char[] ch1 = str1.toCharArray();
    char[] ch2 = str2.toCharArray();

   if(ch1.length != 0) {
    System.out.println(false);
   }
   Arrays.sort(ch1);
   Arrays.sort(ch2);

   // Compare to the sorted array
   System.out.println(Arrays.equals(ch1, ch2));
  }
}
