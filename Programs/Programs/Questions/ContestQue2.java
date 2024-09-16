package Programs.Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContestQue2 {

    public static void main(String[] args) {
        int[] arr = {1,4,3,1};
        ArrayList<Integer> list = new ArrayList<>();
        ArrToList(arr,list);
        int j =1;
        int i= 2;
        while(j<i && i<list.size() && j<list.size())
        {

            if(list.get(i)==0)
            {
                if(i==list.size()-1)
                {
                    break;
                }
                i++;
            }
            if(list.get(j)==0)
            {
                if(j==list.size()-1)
                {
                    break;
                }
                j++;
            }
            else {
                list.add(list.get(j) % list.get(i));
                list.remove(i);
                list.remove(j);
            }
            System.out.println(list);

        }
        System.out.println(list);



    }

    static void ArrToList(int[] arr, ArrayList<Integer> list) {
        for(int i=0;i<arr.length;i++)
        {
            list.add(arr[i]);
        }
    }
}
