package Programs.SomeImpQuestions;

public class FindSmallestDivisior {
    public static void main(String[] args) {
        int[] arr = {44,22,33,11,1};
        System.out.println(getSum(arr,22));
    }

    static int getSum(int[] arr, int div) {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            double ans = (double)arr[i]/div;
            System.out.println((int)Math.ceil(ans));
            sum = sum + (int)Math.ceil(ans);
        }

        return sum;


    }
}
