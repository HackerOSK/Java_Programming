package Programs.Questions;

import java.util.Locale;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "";
        StringBuilder sl = new StringBuilder();
        boolean ans = true;
        for(char i : s.toCharArray())
        {
            if((i>='a' && i<='z')||(i>='A' && i<='Z')||(i>='0' && i<='9'))
            {
                sl.append(i);
            }
        }
        System.out.println(sl);
        String b =sl.toString().toLowerCase();
        StringBuilder rl = sl.reverse();
        System.out.println(rl);
        String a = rl.toString().toLowerCase();

        System.out.println(a);
        System.out.println(b);
        System.out.println(a.compareTo(b));
        if(b.compareTo(a)!=0)
        {
            ans = false;
        }
        System.out.println(ans);

    }
}
