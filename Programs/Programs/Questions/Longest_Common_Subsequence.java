package Programs.Questions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Longest_Common_Subsequence {
    public static void main(String[] args) {
        String t1 = "abcba";
        String t2 = "abcbcba";

        char[] a1 = t1.toCharArray();
        char[] a2 = t2.toCharArray();

        if(t1.length()<t2.length())
        {
            System.out.println(checkSubsequence(a1,a2));
        }
        else
        {
            System.out.println(checkSubsequence(a2,a1));
        }
    }

    static int checkSubsequence(char[] s, char[] l) {
        int count=0;
        int k= -1;
        for(int i=0;i<s.length;i++)
        {
            int ind = search(s[i],l);
            if(ind>-1)
            {
                if(k<ind) {
                    count++;
                    k=ind;
                }
                else
                {
                    if(count<2) {
                        count = 1;
                        k = ind;
                    }
                }
                l[ind] = '#';
            }
            System.out.println(count);
        }

        return count;
    }

    static int search(char a,char[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==a)
            {
                return i;
            }
        }
        return -1;
    }
}
