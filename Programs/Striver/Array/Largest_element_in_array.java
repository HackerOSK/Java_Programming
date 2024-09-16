package Striver.Array;

import java.util.Arrays;

public class Largest_element_in_array {
    public static void main(String[] args) {
        int[] arr = {3,2,1,0,4,1,6,2,1};

//        BruteForce => time complexity O[nLog(n)]
        int large = getLargest(arr);
        System.out.println(
                large
        );


//        Optimal => time complexity O[n]
        int large1 = getLargestO(arr);
        System.out.println(large1);
    }

    static int getLargestO(int[] arr) {
        int max = arr[0];
        for(int i : arr)
        {
            if(i>max)
            {
                max = i;
            }
        }
        return max;
    }

    static int getLargest(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length-1
                ];
    }


}
