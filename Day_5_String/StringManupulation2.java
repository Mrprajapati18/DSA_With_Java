public class StringManupulation2 {
  public static void main(String[] args) {
    
    StringBuffer sb = new StringBuffer("Kodnest"); // 
    System.out.println(sb);
    sb.append(" Technologies pvt ltd");
    System.out.println(sb);
    System.out.println("=========================");

    StringBuilder Sb2 = new StringBuilder("KODNEST");
    System.out.println(Sb2);
    Sb2.append("TECHNOLOGIES PVT LTD");
    System.out.println(Sb2);
  }
  
}
