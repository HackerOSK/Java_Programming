package Striver.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class intersection_of_2_array {
    public static void main(String[] args) {
        int[] arr1 = {1,2,2,3,4,12,33,89};
        int[] arr2 = {4,5,13,33,89,100};

        int l1 = 0;
        int l2 = 0;
        ArrayList<Integer> intersect = new ArrayList<>();

        while(l1<arr1.length && l2<arr2.length)
        {
            if(arr1[l1] == arr2[l2] && (intersect.size()==0 || intersect.get(intersect.size()-1)!=arr1[l1]))
            {
                intersect.add(arr1[l1]);
                l1++;
                l2++;
            }
            else if(arr1[l1] == arr2[l2] && intersect.get(intersect.size()-1)==arr1[l1])
            {
                l1++;
                l2++;
            }
            else if(arr1[l1]>arr2[l2])
            {
                l2++;
            }
            else if(arr2[l2]>arr1[l1])
            {
                l1++;
            }

        }

        int[] intr = new int[intersect.size()];
        int j=0;
        for(int i : intersect)
        {
            intr[j] = i;
            j++;
        }

        System.out.println(Arrays.toString(intr));
    }
}
