package Programs.Questions;
//    Here Alphabets may be in upper as well as lower case

import java.util.Scanner;

public class Longest_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int upr[] = new int[26];
        int low[] = new int[26];
//        A = 65
//        a = 97
        for(char i : str.toCharArray())
        {
            if(i>='A' && i<='Z')
            {
                upr[i-'A']++;
            }
            else if(i>='a' && i<='z')
            {
                low[i-'a']++;
            }
        }

        int numb = getEvenCount(upr,low);
        System.out.println(numb);



    }

    private static int getEvenCount(int[] upr, int[] low) {
        int even =0;
        int Max = 0;
        for(int i : upr)
        {
            if(i%2==0)
            {
                even = even + i;
            }
            else
            {
                even = even + i - 1;
                Max = 1;
            }
        }for(int i : low)
        {
            if(i%2==0)
            {
                even = even + i;
            }
            else
            {
                even = even + i - 1;
                Max = 1;
            }
        }

        return even+Max;
    }
}
