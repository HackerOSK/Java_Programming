package Programs.Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find_Common_Characters {
    public static void main(String[] args) {
        String str1[] = {"cool","lock","cook"};
        StringBuilder str[] = new StringBuilder[str1.length];
        int o=0;
        for(String s : str1)
        {
            str[o]= new StringBuilder(s);
            o++;
        }
        String min = new String();
        int m=Integer.MAX_VALUE;
        int c =str.length;
        int k=0;
        for(StringBuilder i : str)
        {
            if(i.length()<m)
            {
                m=i.length();
                min = i.toString();

            }

        }
        List<String> ans = new ArrayList<>();
        for(char i : min.toCharArray())
        {
            for(int l =0; l<c;l++)
            {
                StringBuilder j = str[l];
                int  lp = j.toString().indexOf(i);
                if(lp>-1)
                {
                    k++;
                    j.deleteCharAt(lp);
                    j.insert(lp,'_');
                }else
                {
                    break;
                }
            }
            if(k==c)
            {
                StringBuilder s = new StringBuilder();
                s.append(i);
                ans.add(s.toString());
            }
            k=0;
        }

        System.out.println(ans);
        System.out.println(Arrays.toString(str));



    }
}
