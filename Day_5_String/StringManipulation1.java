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
      System.out.println("==========================");
      String S = "    KODNEST";
      System.out.println(S);
      String str = S.trim();  // To Remove the extra spaces
      System.out.println(str);
      System.out.println("===========================");
      String S1 = "KODNEST TECHNOLOGIES PVT LTD";
      String arr[] = S1.split(" ");
      for (String X : arr) {
          System.out.println(X);
       }  
       System.out.println("==========================");
       String S2 = "KODNEST TECHNOLOGIES PVT LTD";
      String arr1[] = S2.split("O");
      for (String Y : arr1) {
          System.out.println(Y);
       }  
   } 
}
