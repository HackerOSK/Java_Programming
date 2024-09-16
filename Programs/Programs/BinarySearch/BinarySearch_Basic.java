package Programs.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch_Basic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {213,23,123,43,3,12,9,5,6,7,345,6,56,6,565,};
        Arrays.sort(arr);
        System.out.println("Enter which element so you want to search : ");
        int target = in.nextInt();

        if(binarysearch(arr,target)<=0)
        {
            System.out.println("Target element exist 😀 !!");
        }
        else
        {
            System.out.println("Target element Not exist 😟 !!");
        }


    }

    static int binarysearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        int mid=0;

        while(start<=end)
        {
            mid = start +(end-start)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(arr[mid]>target)
            {
                end = mid-1;
            }
            else {
                start = mid + 1;
            }
        }

        return -1;
    }
}
