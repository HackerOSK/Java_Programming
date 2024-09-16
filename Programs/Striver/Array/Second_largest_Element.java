package Striver.Array;

import Programs.Questions.print;

import java.util.Arrays;

public class Second_largest_Element {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,1,2,0,9,9,11,10};

//        bruteForce time complexity => O[nLog(n)] + O[n]
        int large = getSecondLargest(arr);
        System.out.println(large);


//        better  time complexity => O[n] + O[n] = O[2n]
        int large1 = getSecondLargest1(arr);
        System.out.println(large1);


//        optimal time complexity => O[n]
        int large2 = getSecondLargest2(arr);
        System.out.println(large2);



    }

    static int getSecondLargest2(int[] arr) {
        int large1 = arr[0];
        int large2 = -1;
        for(int i : arr)
        {

            if(i>large1)
            {
                large2 = large1;
                large1=i;
            }
            else if(i>large2 && i<large1)
            {
                large2=i;
            }
        }
        return large2;
    }

    static int getSecondLargest1(int[] arr) {
        int large = arr[0];
        for(int i : arr)
        {
            if(i>large)
            {
                large = i;
            }
        }
        int large2= -1;
        for(int i:arr)
        {
            if(i>large2 && i!=large)
            {
                large2=i;
            }
        }
        return large2;
    }


    static int getSecondLargest(int[] arr2) {
        int[] arr3 = arr2;
        Arrays.sort(arr3);
        int l =arr2.length;
        int large = arr2[l-1];
        for(int i=l-1;i>=0;i--)
        {
            if(arr2[i]!=large)
            {
                return arr2[i];
            }

        }

        return -1;

    }
}
