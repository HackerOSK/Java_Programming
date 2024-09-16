package Programs.BitManipulation;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal number : ");
        int deci = sc.nextInt();
        System.out.println("The binary form of "+deci+" => "+DeciToBi(deci));
    }

//    Time complexity = O[log2(n)]
//    Space complexity = O[log2(n)]


     static String DeciToBi(int deci) {
        StringBuilder res = new StringBuilder();
        while(deci!=1)
        {
            res.append(deci%2);
            deci = deci/2;
        }
        res.append('1');
        return res.reverse().toString();
    }
}
