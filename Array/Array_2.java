public class Array_2 {
  public static void Update(int marks[]) // pass by Reference 
  {
    for (int i=0; i<marks.length; i++){
        marks[i] = marks[i]+1;
    }
  }
  public static void main(String [] args)
  {
    int marks[] = {95,89,90 };
    Update(marks);           // Update the number call by reference

    // print our marks
    for(int i=0; i<marks.length;i++)
    {
      System.out.println(marks[i]+"  ");
    }
    System.out.println();
  }
}
