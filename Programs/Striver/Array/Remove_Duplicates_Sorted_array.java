package Striver.Array;

import java.lang.reflect.Array;
import java.util.HashSet;

public class Remove_Duplicates_Sorted_array {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3,3,4,4,4,5,5,5};

//        BruteForce time complexity => O[n(Log n)]  , space complexity => O[n]
        int ans = removeDuplicate(arr);
        System.out.println("Number of unique elements in sorted array : "+ans);

//        Optimal time Complexity => O[n] Space complexity => O[1]
        int ans1 = removeDuplicate1(arr);
        System.out.println("Number of unique elements in sorted array :"+ans1);






    }

    static int removeDuplicate1(int[] arr) {

        int i=0;
        for(int j=i;j<arr.length;j++)
        {
            if(arr[j]!=arr[i])
            {
                arr[i+1]=arr[j];
                i++;
            }
        }


        return i+1;
    }

    static int removeDuplicate(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : arr)
        {
            set.add(i);
//            Inserting into set time complexity => log(n)
        }
        return set.size();
    }
}
