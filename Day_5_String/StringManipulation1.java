public class StringManipulation1 { 
  public static void main(String[] args) { 
      String str1 = "Sachin"; 
      String str2 = "Saurav"; 

      int res = str1.compareTo(str2); 
      
      if (res > 0) { 
          System.out.println("String str1 is greater"); 
      } 
      else if (res < 0) { 
          System.out.println("String str2 is greater"); 
      } 
      else { 
          System.out.println("Both strings are same"); 
      } 
  } 
}
