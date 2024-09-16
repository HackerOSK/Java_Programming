package Programs.Sorting_Algo;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {12,34,3,11,4,123,36,89};
        System.out.println("Before : "+ Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("After : "+ Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr) {
        int c = 0;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=1;j<arr.length-i;j++)
            {
                if(arr[j-1]>arr[j])
                {
                    arr[j-1] = arr[j-1] * arr[j];
                    arr[j] = arr[j-1] / arr[j];
                    arr[j-1] = arr[j-1] / arr[j];
                    c++;
                }
            }
            if(c==0)
            {
                break;
            }
            else {
                c = 0;
            }
        }
    }
}
