package Programs.BitManipulation;

import java.util.Map;
import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary;
        System.out.println("Enter the binary number : ");
        binary = sc.next();
        System.out.println("The decimal form of "+binary+" => "+BiToDeci(binary));

    }

    static int BiToDeci(String binary) {
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
}
