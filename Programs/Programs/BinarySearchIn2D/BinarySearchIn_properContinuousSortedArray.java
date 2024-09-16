package Programs.BinarySearchIn2D;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchIn_properContinuousSortedArray {
    public static void main(String[] args) {

        int[][] mat= {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        System.out.println("Element At Index : "+ Arrays.toString(Solu(mat,target)));
    }

    static int[] Solu(int[][] mat,int target)
    {
        int c=0;
        for(int[] row : mat )
        {
            if(target>=row[0] && target<=row[row.length-1])
            {
                if(binarySearch(row,target)>-1)
                {
                    return new int[]{c,binarySearch(row,target)};
                }
                else
                {
                    return new int[]{-1,-1};
                }
            }
            c++;
        }

        return new int[]{-1,-1};
    }

    static int binarySearch(int[] arr,int target)
    {
        int start =0;
        int end = arr.length-1;
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(arr[mid]>target)
            {
                end=mid-1;
            }
            else
            {
                start = mid+1;
            }
        }
        return -1;

    }
}
