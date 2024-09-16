package Programs.Questions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AddBinary {
    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        int lenA = a.length();
        int lenB = b.length();
        char[] A = new char[Math.max(lenA,lenB)];
        char[] B = new char[Math.max(lenA,lenB)];

        if(lenA<lenB)
        {
            int i=0;

            while(i<lenB-lenA)
            {
                A[i]='0';
                i++;
            }
            for(int j=0;j<lenA;j++)
            {
                A[i]=a.charAt(j);
                i++;
            }
            B = b.toCharArray();
        }
        else if(lenA>lenB)
        {
            int i=0;
            while(i<lenA-lenB)
            {
                B[i]='0';
                i++;
            }
            for(int j=0;j<lenB;j++)
            {
                B[i]=b.charAt(j);
                i++;
            }
            A = a.toCharArray();
        }
        else
        {
            A = a.toCharArray();
            B= b.toCharArray();
        }

        StringBuilder ans = add(A,B);
        String Ans = ans.toString();
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));
        System.out.println(Ans);
    }

    private static StringBuilder add(char[] a, char[] b) {
        int i=b.length-1;
        StringBuilder ans = new StringBuilder();
        System.out.println(i);
        char c = '0';
        while(i>=0)
        {
            if(a[i]=='0' && b[i]=='0')
            {
                ans.append(c);
                c='0';
            }
            else if((a[i]=='1' && b[i]=='0') || (a[i]=='0' && b[i]=='1'))
            {
                if(c=='1')
                {
                    ans.append('0');
                    c='1';
                }
                else
                {
                    ans.append('1');
                    c='0';
                }
            }
            else if(a[i]=='1' && b[i]=='1')
            {
                if(c=='1')
                {
                    ans.append('1');
                    c='1';
                }
                else
                {
                    ans.append('0');
                    c='1';
                }
            }
            i--;

        }
        if(c=='1') {
            ans.append(c);
        }
        ans.reverse();

        return ans;
    }
}
