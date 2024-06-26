public class maximumValue {
  public void maxOfArray()
  {
    int arr [] = {10,5,3,6,8,4}; // 10
    int ans = 0;

    for(int i = 0; i<arr.length;i++)
    {
    if(arr[i] > ans )
    {
     ans = arr[i];
    }
    }
    System.out.println("Max of Array:"+ans);
  }
  public static void main(String[] args) {
  maximumValue Obj = new maximumValue();
  Obj.maxOfArray();
  }
  
}

