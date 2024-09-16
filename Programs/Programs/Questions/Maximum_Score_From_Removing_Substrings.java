package Programs.Questions;

import java.util.ArrayList;
import java.util.Stack;

public class Maximum_Score_From_Removing_Substrings {
    public static void main(String[] args) {
        String s = "cdbcbbaaabab";
        int count = 0;
        int x = 4;
        ArrayList<Character> ans = new ArrayList<>();
        int y = 5;
        Stack<Character> stk = new Stack<>();
        for(char i : s.toCharArray())
        {
            stk.push(i);
        }
        while(!stk.empty())
        {
            int i =0;
            StringBuilder sb = new StringBuilder();
            while(i<3)
            {
                sb.append(stk.pop());
                i++;
            }
            i=0;
            count += Checkarr(sb.toString(),stk,x,y);
        }

        System.out.println(count);


    }

    private static int Checkarr(String sb, Stack<Character> stk, int x, int y) {
        if (x > y) // ab
        {
            if (sb.contains("ba")) {
                int s = sb.lastIndexOf('b');
                stk.push(sb.charAt(s - 1));
                return x;
            } else if (sb.contains("ab")) {
                int s = sb.lastIndexOf('a');
                stk.push(sb.charAt(s - 1));
                return y;
            }
        } else  // ba
        {
            if (sb.contains("ab")) {
                int s = sb.lastIndexOf('a');
                stk.push(sb.charAt(s - 1));
                return y;
            } else if (sb.contains("ba")) {
                int s = sb.lastIndexOf('b');
                stk.push(sb.charAt(s - 1));
                return x;
            }
        }
        return 0;
    }
}
