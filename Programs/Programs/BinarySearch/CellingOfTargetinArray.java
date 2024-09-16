package Programs.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class CellingOfTargetinArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {1,12,23,34,55,67,89,90};
        Arrays.sort(arr);
        System.out.println("Enter Your Target Element : ");
        int target = in.nextInt();
        int start = 0;
        int end = arr.length-1;
        int mid =0;
        int c = -1;
        while(start<=end)
        {
            mid = start + (end-start)/2;
            if(arr[mid]==target)
            {
                System.out.println(arr[mid]);
                c=0;
                break;
            }
            else if(arr[mid]<target)
            {
                if((mid < arr.length-1)&&(arr[mid+1]>target ))
                {
                    System.out.println(arr[mid+1]);
                    c=0;
                    break;
                }
                start = mid+1;
            }
            else
            {
                if((mid>0)  && arr[mid-1]<target)
                {
                    System.out.println(arr[mid]);
                    c=0;
                    break;
                }
                else if(mid==0)
                {
                    System.out.println(arr[mid]);
                    c=0;
                    break;
                }
                end=mid-1;
            }
        }
        if(c<0)
        {
            System.out.println(-1);
        }

    }
}
