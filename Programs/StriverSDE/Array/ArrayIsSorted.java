package StriverSDE.Array;

import java.util.Arrays;

public class ArrayIsSorted {
    public static void main(String[] args) {
        int arr[] = {1,5,2,6,12,4,90};
//        Arrays.sort(arr);
//        check if the above array is sorted in non descending order
        for(int i=0;i< arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                System.out.println("NOT sorted");
                return;
            }
        }
        System.out.println("Sorted");
    }
}
