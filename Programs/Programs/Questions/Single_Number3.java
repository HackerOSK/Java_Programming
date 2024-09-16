package Programs.Questions;

import java.util.Arrays;
import java.util.HashMap;

public class Single_Number3 {
    public static void main(String[] args) {
        int arr[] = {1,2,1,3,2,5};

//      O[n+2] space complexity

//        HashMap<Integer,Integer> freqMap = new HashMap<>();
//        for(int i : arr)
//        {
//            if(freqMap.containsKey(i))
//            {
//                freqMap.put(i, freqMap.get(i)+1);
//            }
//            else
//            {
//                freqMap.put(i,1);
//            }
//        }
//
//        int ans[] = new int[2];
//        int j=0;
//        for(int i : freqMap.keySet())
//        {
//            System.out.println(i);
//            System.out.println(freqMap.get(i));
//
//            if(freqMap.get(i)==1)
//            {
//                ans[j] = i;
//                j++;
//            }
//        }
//        System.out.println(Arrays.toString(ans));

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]-arr[j]==0)
                {
                    arr[i] = 0;
                    arr[j] = 0;
                }
            }
        }



    }
}
