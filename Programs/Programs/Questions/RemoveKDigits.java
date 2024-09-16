package Programs.Questions;

import java.util.Stack;

public class RemoveKDigits {
    public static void main(String[] args) {
        String num = "10";
        Stack<Integer> stk = new Stack<>();
        int k = 1;
        for(int i=0;i<num.length();i++)
        {
            int n = num.charAt(i)-'0';
            if(stk.isEmpty())
            {
                stk.push(n);
            }
            else if(stk.peek()<=n)
            {
                stk.push(n);
            }
            else
            {
                if(k>0)
                {
                    stk.pop();
                    i--;
                    k--;
                }
                else
                {
                    stk.push(n);
                }

            }
        }

        while(k!=0)
        {
            stk.pop();
            k--;
        }

        System.out.println(stk);
        StringBuilder ans = new StringBuilder();
        for(int i:stk)
        {
            char ch = (char)(i + 48);
            if(ch=='0' && ans.isEmpty())
            {
                continue;
            }
            ans.append(ch);
        }

        if(ans.isEmpty())
        {
            System.out.println("0");
        }
        else {
            System.out.println(ans);
        }



    }
}
