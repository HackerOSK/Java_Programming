package Programs.Questions;

import java.util.ArrayList;

public class pascalsTriangle {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> Listpart0 = new ArrayList<>();
        ArrayList<Integer> Listpart1 = new ArrayList<>();
        Listpart0.add(1);
        Listpart1.add(1);
        Listpart1.add(1);
        list.add(Listpart0);
        list.add(Listpart1);
        System.out.println(list);
        int n=5;
        for(int i=2;i<n;i++)
        {
            Listpart0.clear();
            Listpart0.add(1);
            for(int j=0;j<list.get(i-1).size()-1;j++)
            {
                Listpart0.add(list.get(i-1).get(j)+list.get(i-1).get(j+1));
            }
            Listpart0.add(1);
            list.add(Listpart0);
        }

        System.out.println(list);




    }
}
