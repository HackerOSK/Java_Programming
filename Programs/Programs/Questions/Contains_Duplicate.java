package Programs.Questions;

import java.util.HashSet;
import java.util.Set;

public class Contains_Duplicate {
    public static void main(String[] args) {
        Set<Integer>set = new HashSet<>();
        int nums[] = {1,2,3,4};
        for(int i:nums)
        {
            if(set.contains(i))
            {
                System.out.println(true);
            }else{
                set.add(i);
            }
        }

        System.out.println(false);
    }
}
