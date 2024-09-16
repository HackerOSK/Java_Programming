package Programs.Questions;

import java.util.ArrayList;

public class MinimumRecolors_to_Get_K_Consecutive_Black_Blocks {
    public static void main(String[] args) {
        String blocks = "WBWBBBW";
        int k = 2;
        int j=0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=k;i<=blocks.length();i++)
        {
            String substr = blocks.substring(j,i);
            list.add(countWhite(substr));
            j++;
        }

        int min = Integer.MAX_VALUE;
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)<min)
            {
                min= list.get(i);
            }
        }

        System.out.println(min);

    }

    private static int countWhite(String substr) {
        int count=0;
        for(int i=0;i<substr.length();i++)
        {
            if(substr.charAt(i)=='W')
            {
                count++;
            }
        }

        return count;
    }
}
