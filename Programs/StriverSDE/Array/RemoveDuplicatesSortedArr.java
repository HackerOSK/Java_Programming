package StriverSDE.Array;

import java.util.Arrays;

public class RemoveDuplicatesSortedArr {
    public static void main(String[] args) {
        int arr[] = {1,5,2,5,2,5,1};
        Arrays.sort(arr);
        int ptr1=0;
        int ptr2 =1;
        while(ptr2<arr.length)
        {
            if(arr[ptr1]!=arr[ptr2])
            {
                arr[ptr1+1]=arr[ptr2];
                ptr1++;
            }
            ptr2++;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(ptr1+1);

    }
}
