package Programs.Questions;

import java.util.Stack;

public class PostFix_evaluation {
    public static void main(String[] args) {
        String[] exp = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        Stack<Integer> stk = new Stack<>();
        int i=0;
        int a,b;
        int ans;
        while(i<exp.length)
        {
            if(exp[i]=="+" && i>=2)
            {
                a = stk.pop();
                b = stk.pop();
                ans = b+a;
                stk.push(ans);
            }else if(exp[i]=="-" && i>=2)
            {
                a = stk.pop();
                b = stk.pop();
                ans = b-a;
                stk.push(ans);
            }else if(exp[i]=="*" && i>=2)
            {
                a = stk.pop();
                b = stk.pop();
                ans = b*a;
                stk.push(ans);
            }else if(exp[i]=="/" && i>=2)
            {
                a = stk.pop();
                b = stk.pop();
                ans = b/a;
                stk.push(ans);
            }
            else
            {
                int k = Integer.parseInt(exp[i]);
                stk.push(k);
            }
            i++;
        }

        System.out.println(stk.peek());

    }
}
