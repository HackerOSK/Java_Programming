package Programs.BitManipulation;

import java.util.Scanner;

public class Ones_Twos_Complement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        System.out.println("1's Complement of "+num+" => "+OnesComplement(num));
        System.out.println("2's Complement of "+num+" => "+TwosComplement(num));
    }

    static int TwosComplement(int num) {
        num = OnesComplement(num);
        String bi = deciTobi(num);
        StringBuilder ans = new StringBuilder();
        int c=1;
        for(int i=bi.length()-1;i>=0;i--)
        {
            if(bi.charAt(i)=='1' && c==1) {
                ans.append('0');
            }
            else if(bi.charAt(i)=='1' && c==0)
            {
                ans.append('1');
            }
            else {
                ans.append(c);
                c=0;
            }
        }
        return biTodeci(ans.toString());
    }

    static int biTodeci(String binary) {
        int len = binary.length();
        int decimal=0;
        for(int i=len-1;i>=0;i--)
        {

            if(binary.charAt(i)=='1')
            {
                decimal+= (int) Math.pow(2,len-(i+1));
            }

        }
        return decimal;
    }

    static String deciTobi(int deci) {
        StringBuilder res = new StringBuilder();
        while(deci!=1)
        {
            res.append(deci%2);
            deci = deci/2;
        }
        res.append('1');
        return res.reverse().toString();
    }

    static int OnesComplement(int num) {
        String bi = deciTobi(num);
        StringBuilder ans = new StringBuilder();
        for(char i : bi.toCharArray())
        {
            if(i=='1')
            {
                ans.append('0');
            }
            else
            {
                ans.append('1');
            }
        }
        return biTodeci(ans.toString());
    }
}
