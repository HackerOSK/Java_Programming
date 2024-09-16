package Programs.Questions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Bag_of_Tokens {
    public static void main(String[] args) {
        int[] tokens = {};
        int power = 200;
        int credit = 0;
        int i = 0;
        int k=1;
        int j=i;

        if(tokens.length==0)
        {
            System.out.println(0);
        }

        else {

            ArrayList<Integer> list = new ArrayList<>();

            Arrays.sort(tokens);
            Boolean loop = true;
            while (loop && i <= tokens.length - k) {
                if (tokens[i] <= power) {
                    power = power - tokens[i];
                    tokens[i] = 0;
                    credit++;
                    i++;
                } else if (tokens[i] > power && credit > 0) {
                    j = i;
                    i = tokens.length - k;
                    power = power + tokens[i];
                    tokens[i] = 0;
                    credit--;
                    k++;
                    i = j;
                } else {
                    loop = false;
                }
                list.add(credit);

            }

            System.out.println(list);
            System.out.println(Collections.max(list));
        }

    }
}
