public class StringManipulation {
  public static void main(String[] args) {
    String S = "KodNest Technologies Pvt Ltd";
    String S1 = ""; // It is Empty String
    String S2 = " "; // Not Empty String 
    System.out.println(S.toUpperCase());
    System.out.println(S.toLowerCase());
    System.out.println(S.contains("Pvt"));
    System.out.println(S.concat(" Is Best institute"));
    System.out.println(S.substring(25));
    System.out.println(S.substring(5,25));
    System.out.println(S.length());
    System.out.println(S.startsWith("k"));
    System.out.println(S.startsWith("Ko"));
    System.out.println(S.startsWith("Kodnest"));
    System.out.println(S.endsWith("t"));
    System.out.println(S.endsWith("Ltd"));
    System.out.println(S.indexOf('o'));
    System.out.println(S.indexOf("Ltd"));
    System.out.println(S.isEmpty());
    System.out.println(S1.isEmpty());
    System.out.println(S2.isEmpty());
    System.out.println(S.lastIndexOf('T'));
    System.out.println(S.charAt(21));
    System.out.println(S.replace('P', 'p'));
  } 
}
