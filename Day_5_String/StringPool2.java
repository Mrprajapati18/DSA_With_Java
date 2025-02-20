public class StringPool2 {
  public static void main(String[] args) {
    
    String s1 = "Rama";
    String s2 = "Sita";

    String s3 = s1 + s2;
    String s4 = s1 + s2;

    if(s3 == s4) {
      System.out.println("Reference are Equal");
    }
    else {
      System.out.println("Reference are not equal");
    }
    if(s3.equals(s4)) {
      System.out.println("String are eqaul");
    }
    else{
      System.out.println("String are not eqaul");
    }
  }
  
}
