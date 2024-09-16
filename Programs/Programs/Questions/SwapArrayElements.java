package Programs.Questions;

import java.util.Arrays;
import java.util.Scanner;

public class SwapArrayElements {
    public static void main(String[] args) {
        int[] arr = {1,2,4,52,23,7};
        swap(arr,3,4);
        System.out.println(Arrays.toString(arr));
        swap(arr,5,3);
        System.out.println(Arrays.toString(arr));
        swap(arr,4,5);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr,int a,int b)
    {
        arr[a] = arr[a]*arr[b];
        arr[b] = arr[a]/arr[b];
        arr[a] = arr[a]/arr[b];
    }
}
