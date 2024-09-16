package Programs.Questions;

import java.util.Arrays;

public class Maximum_Odd_Binary_Number {
    public static void main(String[] args) {
        String s = "1010";
        char[] si = s.toCharArray();
        Arrays.sort(si);
        int l = si.length-1;
        for(int i=0;i<si.length/2;i++)
        {
            char temp = si[i];
            si[i] = si[l-i];
            si[l-i]=temp;
        }
        for(int i=si.length-1;i>=0;i--)
        {
            if(si[i]=='1')
            {
                si[i] = '0';
                si[si.length-1] = '1';

                break;
            }
        }
        String n = new String(si);
        System.out.println(n);




    }
}
