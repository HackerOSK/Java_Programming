package Programs.BinarySearch;

import Programs.Questions.MaxInArray;

import java.util.Arrays;
import java.util.Scanner;


public class SearchInInfiniteArray{
//    Here we not know size of array and we are not using array.length function
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[] arr = {12,34,1,3,314,34,56,767,86};
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));
    int target = in.nextInt();
    int start =0;
    int end = 1;
    int i = 0;
    while(true)
    {
        if((target>=arr[start])&&(target<=arr[end]))
        {
            break;
        }
        i++;
        start = end+1;
        end = end + (int)power(2,i);

    }

    System.out.println(binarysearch(arr,target,start,end));

}

static int power(int base,int index)
{
    int res=1;
    for(int i=1;i<=index;i++)
    {
        res=res*base;
    }

    return res;
}
    static int binarysearch(int[] arr, int target,int start,int end) {

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
