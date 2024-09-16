package Programs.Questions;

import java.util.ArrayList;

public class MinimumBitFlipstoConvertNumber {
    public static void main(String[] args) {
        int start = 3;
        int goal = 4;
        ArrayList<String> str = new ArrayList<>();
        str.add(Integer.toString(start,2));
        str.add(Integer.toString(goal,2));
        MakeCorrect(str);
        System.out.println(str);
        int ans=0;
        for(int i=0;i<str.get(0).length();i++)
        {
            if(str.get(0).charAt(i)!=str.get(1).charAt(i))
            {
                ans++;
            }
        }
        System.out.println(ans);


    }

    private static void MakeCorrect(ArrayList<String> str) {
        if(str.get(0).length()>str.get(1).length())
        {
            StringBuilder sb = new StringBuilder();
            int diff = str.get(0).length()-str.get(1).length();
            while(diff>0) {
                sb.append('0');
                diff--;
            }
            sb.append(str.get(1));
            str.set(1,sb.toString());
        }else if(str.get(0).length()<str.get(1).length())
        {
            StringBuilder sb = new StringBuilder();
            int diff = str.get(1).length()-str.get(0).length();
            while(diff>0) {
                sb.append('0');
                diff--;
            }
            sb.append(str.get(0));
            str.set(0,sb.toString());
        }
    }
}
