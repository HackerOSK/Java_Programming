package Programs.BinarySearch;

import Programs.Questions.MaxInArray;

import java.util.Arrays;

public class Split_Array_Largest_Sum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 2;
        System.out.println(findLargestSum(arr,k));
    }

    static int findLargestSum(int[] arr,int k) {
        MaxInArray array = new MaxInArray();
        int start = array.Max(arr);
        int end = Arrays.stream(arr).sum();
        System.out.println(start);
        System.out.println(end);
        while(start<end)
        {
            int mid = (start+end)/2;
            System.out.println(mid);
            int i=0,j=0,piece=0,sum=0;

            while(i < arr.length)
            {
                sum = sum + arr[i];
                System.out.println("sum : "+sum+" i :"+i);
                if(sum>mid)
                {
                    sum=0;
                    j=0;
                    i--;
                    piece++;
                }
                j++;
                i++;
            }
            piece++;
            System.out.println("piece : "+piece);

            if(piece<=k)
            {
                end = mid;
            }
            else
            {
                start = mid+1;
            }

            System.out.println("start = "+start);
            System.out.println("end = "+end);


        }
        return start;

    }
}
