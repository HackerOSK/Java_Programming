package Programs.Questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Sequential_Digits {
//    public static void main(String[] args) {
//        Set<Integer> list = new HashSet<>();
//        ArrayList<Integer> list1 = new ArrayList<>();
//        String nums = "0123456789"; int low =1000;
//        int high = 13000;
//
//
//        int i=1;
//        while(i<=9)
//        {
//            for(int j=0;j<9-i+1;j++)
//            {
//                int num = Integer.parseInt(nums.substring(j,j+i+1));
//
//                    list.add(num);
//
//            }
//            i++;
//        }
//        System.out.println(list);
//
//
//        for(int num : list)
//        if(num>=low && num<=high) {
//            list1.add(num);
//        }
//
//
//        Collections.sort(list1);
//        System.out.println(list1);
//
//
//    }


//    Optimised solution
public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    int low = 1000;
    int high = 13000;

    for(int digit = 1;digit<=9;digit++)
    {
        int next = digit, n=next;
        while (n<=high && next<10)
        {
            if(n>=low)
            {
                list.add(n);
            }
            n = n * 10 + (++next);
        }

    }
    Collections.sort(list);
    System.out.println(list);
}
}
