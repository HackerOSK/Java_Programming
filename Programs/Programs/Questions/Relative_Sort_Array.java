package Programs.Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Relative_Sort_Array {
    public static void main(String[] args) {
        int arr1[] = {2,3,1,3,2,4,6,7,9,2,19};
        int arr2[] = {2,1,4,3,9,6};
//        HashMap<Integer,Integer> freqMap = new HashMap<>();
//        for(int i : arr1)
//        {
//            if(freqMap.containsKey(i))
//            {
//                freqMap.put(i,freqMap.get(i)+1);
//            }else{
//                freqMap.put(i,1);
//            }
//            System.out.println(freqMap);
//        }
//
//        System.out.println(freqMap);
//        int j =0;
//        for(int i : arr2)
//        {
//            if(freqMap.containsKey(i))
//            {
//                for(int k =0;k<freqMap.get(i);k++)
//                {
//                    arr1[j] = i;
//                    j++;
//                }
//            }freqMap.remove(i);
//        }
//
//        ArrayList<Integer> a = new ArrayList<>(freqMap.keySet());
//        Collections.sort(a);
//        for(int i : a)
//        {
//            for(int k =0;k<freqMap.get(i);k++)
//            {
//                arr1[j] = i;
//                j++;
//            }
//        }

        int freqarr[] = new int[1001];
        for(int i : arr1)
        {
            freqarr[i]++;
        }
        int ans[] = new int[arr1.length];
        int j=0;
        for(int i : arr2)
        {
            while(freqarr[i]>0)
            {
                ans[j]=i;
                j++;
                freqarr[i]--;
            }
        }
        for(int i=0;i<freqarr.length;i++)
        {
            while(freqarr[i]>0)
            {
                ans[j]=i;
                j++;
                freqarr[i]--;
            }
        }

        System.out.println(Arrays.toString(ans));


    }
}
