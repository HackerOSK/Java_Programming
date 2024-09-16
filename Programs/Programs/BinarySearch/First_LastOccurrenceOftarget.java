package Programs.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class First_LastOccurrenceOftarget {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = {1,2,2,3,4,4,4,4,5};
        
        System.out.println("Enter the target element : ");
        int target = in.nextInt();
        int[] pos = new int[2];
        pos[0] = firstOccurrence(nums,target);
        pos[1] = lastOccurrence(nums,target);

        System.out.println(Arrays.toString(pos));


    }
    static int firstOccurrence(int[] arr,int target)
    {
        int start = 0;
        int end = arr.length-1;
        int mid=0;

        while(start<=end)
        {
            mid = start + (end-start)/2;
            if(arr[mid]==target)
            {
                if((mid==0) || (arr[mid-1]!=target))
                {
                    return mid;
                }
                end = mid;
            }
            else if(arr[mid]>target)
            {
                end = mid-1;
            }
            else
            {
                start = mid+1;
            }
        }

        return -1;
    }

    static int lastOccurrence(int[] arr,int target)
    {
        int start = 0;
        int end = arr.length-1;
        int mid=0;

        while(start<=end)
        {
            mid = start + (end-start)/2;
            if(arr[mid]==target)
            {
                if((mid==arr.length-1) ||(arr[mid+1]!=target))
                {
                    return mid;
                }
                start=mid+1;
            }
            else if(arr[mid]>target)
            {
                end = mid-1;
            }
            else
            {
                start = mid+1;
            }
        }

        return -1;
    }
}
