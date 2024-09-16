package StriverSDE.Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LeftRotateArrayByD {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,6};
        int D = 4;
        D = D % arr.length;
        System.out.println(Arrays.toString(arr));
        reverse(arr,0,D-1);
//        System.out.println(Arrays.toString(arr));
        reverse(arr,D,arr.length-1);
//        System.out.println(Arrays.toString(arr));
        reverse(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int [] arr, int i, int j)
    {
        while(j>i)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
