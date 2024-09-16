package Programs.Questions;

import java.util.ArrayList;

public class IsSubString {
    public static void main(String[] args) {
        String a = "mississip";
        String b = "issip";

        int j=0;
        int count=0;
        int c=-1;
        int k=-1;
        ArrayList<Integer> list = ArrayIndex(a,b.charAt(0),b.length());
        System.out.println(list);
        int l = list.size();
        while(l!=0)
        {

            for(int i=list.get(list.size()-l);i<list.get(list.size()-l)+b.length();i++)
            {
                if(a.charAt(i)==b.charAt(j))
                {
                    j++;
                    count++;
                }
                else
                {
                    break;
                }
                if(count==b.length())
                {
                    c=list.get(list.size()-l);
                    k=0;
                }

            }
            if(k==0)
            {
                break;
            }
            j=0;
            count = 0;
            l--;
        }

        System.out.println(c);

    }

    static ArrayList<Integer> ArrayIndex(String a, char c,int len) {
        ArrayList<Integer> list = new ArrayList<>(3);
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)==c)
            {
                if(a.length()-i >= len) {
                    list.add(i);
                }
            }
        }

        return list;

    }


}
