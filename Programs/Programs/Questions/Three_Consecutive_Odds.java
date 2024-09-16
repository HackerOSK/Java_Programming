package Programs.Questions;

public class Three_Consecutive_Odds {
    public static void main(String[] args) {
        int arr[] = {1,2,34,3,4,5,7,23,12};
        System.out.println(checkOdd(arr));
    }

    private static boolean checkOdd(int[] arr) {
        int i=0;
        int c = 0;
        while(i<arr.length)
        {
            if(arr[i]%2==0)
            {
                c=0;
            }else{
                c++;
            }

            if(c==3)
            {
                return true;
            }
            i++;
        }
        return false;
    }
}
