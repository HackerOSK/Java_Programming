package Striver.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class UnionOf2SortedArray {
    public static void main(String[] args) {
        int arr1[] = {1,1,2,3,4,4,6,13,34};
        int arr2[] = {1,4,5,6,9,12,12,33,34,35};

//      BruteForce
//      Time Complexity => O[n1] + O[n2] + O[n1 U n2]
//      Space Complexity => O[n1 U n2] + O[n1 U n2]
        int ans[] = getUnion(arr1,arr2);
        System.out.println(Arrays.toString(ans));


//      Optimal
        int ans1[] = getUnionArr1(arr1,arr2);
        System.out.println(Arrays.toString(ans1));

    }

    static int[] getUnionArr1(int[] arr1, int[] arr2) {
        int l1 = 0;
        int l2 = 0;

        ArrayList<Integer> uni = new ArrayList<>();

        while((l1<arr1.length) && (l2 <arr2.length)) {

            if (arr1[l1] == arr2[l2] && (uni.size() == 0 || uni.get(uni.size() - 1) < arr1[l1])) {
                uni.add(arr1[l1]);
                l1++;
                l2++;
            } else if (arr1[l1] == arr2[l2] && uni.get(uni.size() - 1) == arr1[l1]) {
                l1++;
                l2++;
            } else if (arr1[l1] < arr2[l2] && (uni.size() == 0 || uni.get(uni.size() - 1) < arr1[l1])) {
                uni.add(arr1[l1]);
                l1++;
            } else if (arr1[l1] < arr2[l2] && uni.get(uni.size() - 1) == arr1[l1]) {
                l1++;
            } else if (arr1[l1] > arr2[l2] && (uni.size() == 0 || uni.get(uni.size() - 1) < arr2[l2])) {
                uni.add(arr2[l2]);
                l2++;
            } else if (arr1[l1] > arr2[l2] && uni.get(uni.size() - 1) == arr2[l2]) {
                l2++;
            }

        }

        while(l2<arr2.length)
        {
            if(arr2[l2]> uni.get(uni.size() - 1))
            {
                System.out.println(arr2[l2]);
                uni.add(arr2[l2]);
                l2++;
            }
        }

        while(l1<arr1.length)
        {
            System.out.println("hi");
            if(arr1[l1]> uni.get(uni.size() - 1))
            {
                uni.add(arr1[l1]);
                l1++;
            }
        }

        int [] union = new int[uni.size()];
        int j=0;
        for(int i : uni)
        {
            union[j] = i;
            j++;
        }

        return union;
    }



    static int[] getUnion(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : arr1)
        {
            set.add(i);
        }
        for(int i : arr2)
        {
            set.add(i);
        }
        int i=0;
        int ans[] = new int[set.size()];
        for(int a : set)
        {
            ans[i] = a;
            i++;
        }

        return ans;
    }
}
