
public class StringPool1 {

  public static void main(String[] args) {
    
    String  s1 = "Omakar";
    String s2 = new String("Omkar");
    String s3 = new String("omakar");
  
  if( s1 == s2) {
    System.out.println("Referenced are eqaul");
  } else {
    System.out.println("Reference are uneqaul");
  }
  if(s1.equals(s2)) {
    System.err.println("String are equal");
  }
  else{
    System.out.println("String are unequal");
  }
  if(s2 == s3) {
    System.out.println("Reference s2 is equal to s3");
  }
  else {
    System.out.println("Reference s2 unequal to s3");
  }
  if(s2.equals(s3)) {
    System.out.println("String s2 is equal to s3");
  }
  else{
    System.out.println("String s2 is unequal to s3");
  }
}
}
