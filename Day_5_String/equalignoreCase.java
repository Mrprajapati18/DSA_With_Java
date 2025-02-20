public class equalignoreCase {
  public static void main(String[] args) {
    String S1 = "KODNEST";
    String S2 = "kodnest";

    if(S1==S2) {
      System.out.println("Reference are equal");
    }
    else{
      System.out.println("Reference are unequal");
    }
    if(S1.equals(S2)) {
      System.out.println("String are equal");
    }
    else{
      System.out.println("String are not eqaul");
    }
    if(S1.equalsIgnoreCase(S2)) {
      System.out.println("String are eqaul when eqaul ignore case");
    }
    else{
      System.out.println("String are not eqaul when reqal ignore case are not equal");
    }
  }
}
