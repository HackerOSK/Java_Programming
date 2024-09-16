package Programs.Questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Number_of_Atoms {
    public static void main(String[] args) {
        String str = "H2O";
        Stack<Character> Stk = new Stack<>();
        HashMap<String,Integer> map = new HashMap<>();

        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch>=48 && ch<=57)
            {
//                number
                int count = ch - 48;
                ArrayList<Character> ans = new ArrayList<>();
                while(Stk.peek()<65 && Stk.peek()>90)
                {
                    ans.add(Stk.pop());
                }
                ans.add(Stk.pop());
                StringBuilder sb = new StringBuilder();
                for(int j=ans.size()-1;j>=0;j--)
                {
                    sb.append(ans.get(j));
                }
                String key = sb.toString();
                if(map.containsKey(key))
                {
                    map.put(key,map.get(key)+count);
                }else {
                    map.put(key,count);
                }
            }
            Stk.push(ch);
        }

        while(!Stk.empty())
        {

        }

        System.out.println(map);
    }
}
