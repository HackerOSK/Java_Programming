package Programs.Questions;

import java.util.Arrays;

public class RotateArrayBy1 {
//    left Rotate
//    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
//        int temp = arr[0];
//        for(int i=1;i< arr.length;i++)
//        {
//            arr[i-1]=arr[i];
//        }
//        arr[arr.length-1]=temp;
//
//        System.out.println(Arrays.toString(arr));
//
//    }

//    right Rotate
public static void main(String[] args) {
    int[] arr = {1,2,3,4,5};
    int temp = arr[arr.length-1];
    for(int i=arr.length-1;i>0;i--)
    {
        arr[i]=arr[i-1];
    }

    arr[0]=temp;

    System.out.println(Arrays.toString(arr));
}
}
