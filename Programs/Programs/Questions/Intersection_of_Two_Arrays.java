package Programs.Questions;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

public class Intersection_of_Two_Arrays {
    public static void main(String[] args) {
        int c=0;
        int[] num1 = {4,9,5};
        int[] num2 = {9,4,9,8,4};
        HashSet<Integer> Num1 = new HashSet<>();
        HashSet<Integer> Num2 = new HashSet<>();
        HashSet<Integer> intersect = new HashSet<>();
        for(int i : num1)
        {
            Num1.add(i);
        }
        for(int i : num2)
        {
            Num2.add(i);
        }


        if(Num1.size()>Num2.size())
        {
            for(int i : Num1)
            {
                if(Num2.contains(i))
                {
                    intersect.add(i);
                }
            }
        }
        else
        {
            for(int i : Num2)
            {
                if(Num1.contains(i))
                {
                    intersect.add(i);
                }
            }
        }
        int[] inte = new int[intersect.size()];

        for(int i:intersect){
            inte[c++] = i;
        }

        System.out.println(Arrays.toString(inte));


    }
}
