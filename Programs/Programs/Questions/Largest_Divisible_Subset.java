package Programs.Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Largest_Divisible_Subset {
    public static void main(String[] args) {
        int[] nums = {1,2,4,8};
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int i = 1;
        list.add(nums[0]);
        while (i<nums.length)
        {
            if(checkDivisible(nums[i],list))
            {
                list.add(nums[i]);
            }
            i++;
        }
        if(list.size()==1)
        {
            list.removeFirst();
        }
        System.out.println(list);
    }

    private static boolean checkDivisible(int num, List<Integer> list) {
        for(int i=0;i<list.size();i++)
        {
            if(num%list.get(i)!=0 && list.get(i)%num!=0)
            {
                return false;
            }
        }

        return true;
    }
}
