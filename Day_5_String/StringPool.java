public class StringPool {
public static void main(String[] args) {
  
  String  s1 = "kodnest";
  String s2 = "Kodnest";
 
  // String are not allow Duplicate(location same)
  if( s1 == s2 ){
    System.out.println("Referenced are Equal");
  }
  else {
    System.out.println("Refrerence are unequal");
  }
  // String are not allow duplicate(same string)
  if(s1.equals(s2)) {
    System.out.println("String are equal");
  }
  else {
    System.out.println("String are unequal");
  }
  } 
}
