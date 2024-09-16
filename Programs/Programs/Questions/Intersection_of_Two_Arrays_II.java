package Programs.Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Intersection_of_Two_Arrays_II {
    public static void main(String[] args) {
        int num1[] = {4,9,5};
        int num2[] = {9,4,9,8,4};
        System.out.println(Arrays.toString(answer(num1,num2)));
    }

    private static int[] answer(int[] num1, int[] num2) {
        HashMap<Integer,Integer> map = new HashMap();
        for(int i : num1)
        {
            if(!map.containsKey(i))
            {
                map.put(i,0);
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for(int i:num2)
        {
            if(map.containsKey(i))
            {
                ans.add(i);
            }
        }

        int a[] = new int[ans.size()];
        int j=0;
        for(int i:ans)
        {
            a[j] = i;
            j++;
        }

        return a;
    }
}
