public class SumArray {
    void sumOfArray() {
        int[] arr = {1, 4, 5, 6, 8};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            //sum += arr[i];
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        SumArray obj = new SumArray();
        obj.sumOfArray();
    }
}

