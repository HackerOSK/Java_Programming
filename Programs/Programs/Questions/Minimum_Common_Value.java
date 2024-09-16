package Programs.Questions;

public class Minimum_Common_Value {
    public static void main(String[] args) {
        int[] num1 = {3,5};
        int[] num2 = {2};

        int j=0;
        while (j!=num1.length)
        {
            int res =binarySearch(num1[j],num2);
            if(res>0)
            {
                System.out.println(res);
                break;
            }
            j++;
        }
        System.out.println(-1);
    }

    private static int binarySearch(int target, int[] num2) {
        int s = 0;
        int e = num2.length;
        while(s<=e && s<num2.length && e>=0)
        {
            int mid = s + (e-s)/2;
            if(num2[mid]==target)
            {
                return num2[mid];
            }
            else if(num2[mid]>target)
            {
                e = mid-1;
            }
            else
            {
                s = mid+1;
            }
        }
        return -1;
    }
}
