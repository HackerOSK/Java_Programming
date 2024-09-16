package Programs.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimensionalArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


//        Declaration
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(5);

//        initialisation
        for(int i =0;i<3;i++)
        {
            list.add(new ArrayList<>(5));
        }

        //add element
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                list.get(i).add(in.nextInt());
            }
        }
//      display List
        System.out.println(list);
    }
}
