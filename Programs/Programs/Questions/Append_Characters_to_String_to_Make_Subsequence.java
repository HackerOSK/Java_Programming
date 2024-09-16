package Programs.Questions;

import java.util.Scanner;

public class Append_Characters_to_String_to_Make_Subsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "z";
        String t = "abcde";
        char s1[] = s.toCharArray();
        char t1[] = t.toCharArray();

        int i=0;
        int j=0;
        int c=0;
        for(i=0;i<s1.length;i++)
        {
            if(t1[j]==s1[i])
            {
                j++;
            }
            if(j==t1.length)
            {
                System.out.println(0);
                c=1;
                break;
            }
        }
        if(c==0)
        {
            System.out.println(t1.length-j);
        }



    }
}
