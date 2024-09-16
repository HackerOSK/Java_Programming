package Programs.Questions;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Plus_One {
    public static void main(String[] args) {
       int[] num = {9,8,7,6,5,4,3,2,1,0};
       int[] carry = new int[num.length];
       for(int i=0;i<num.length-1;i++)
       {
           carry[i]=0;
       }
       carry[num.length-1]=1;
       int[] ans = Add(num,carry);
        System.out.println(Arrays.toString(ans));


    }

    static int[] Add(int[] num, int[] carry) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=num.length-1;i>=0;i--)
        {
            int ans = num[i]+carry[i];
            if(ans>9 && i>0)
            {
                carry[i-1]=1;
                ans = 0;
            }
            else if(ans>9 && i==0)
            {
                list.add(0);
                ans=1;
            }

            list.add(ans);
        }


        int arr[] = new int[list.size()];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = list.reversed().get(i);
        }

        return arr;
    }


}
