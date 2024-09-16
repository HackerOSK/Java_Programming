package Programs.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {

    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner in = new Scanner(System.in);

//        Taking Input
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = in.nextInt();
        }
//
////      Printing Output
//        for(int i=0;i<arr.length;i++)
//        {
//            System.out.print(arr[i]+" ");
//        }


//        Taking Input
//        for(int num : arr)
//        {
//            num = in.nextInt(); // Here we cannot change the value of elements inside the array because for-each loop not allow us to manipulate the array
//        }


//        Taking Output
        for(int num : arr)
        {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println(Arrays.toString(arr)); // [12, 32, 34, 21, 1]
    }
}
