package Programs.BitManipulation;

public class Bit_Operations {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;

        System.out.println("AND operation : ");
        int c = a & b;
//        10 => 1010 & 2 => 0010 10 & 2 => 0010 (2)
        System.out.println(a+" AND "+b+" => "+c);
        System.out.println("All 1 then 1 else 0");

        System.out.println("\nOR operation : ");
        c = a | b;
//        1010 | 0010 => 1010
        System.out.println(a+" OR "+b+" => "+c);
        System.out.println("All 0 then 0 else 1");

        System.out.println("\nXOR operation : ");
        c = a ^ b;
//        1010 ^ 0010 => 1000
        System.out.println(a+" XOR "+b+" => "+c);
        System.out.println("Even number of 1's or 0's get 0 else 1");

        System.out.println("\nRight Shift operation : ");
        c = a >> b;
//        1010 >> 0010 so 1010 => 0101 => 0010 (2)
//        a >> b = a/(2^b)
//        1010 = (1*2^3) + (0*2^2) + (1*2^1) + (0*2^0)
//        0010 = (1*2^1) + (1*2^0)
//        1010 = (1*2^1) + (1*2^0) * 2^2
        System.out.println(a+" Right Shifted by "+b+" => "+c);
        System.out.println("bits of a shifted right side by b bits");

        System.out.println("\nLeft Shift operation : ");
        c = a << b;
//        1010 << 0010 so 1010 => 10100 => 101000 (40)
//        a << b = a*(2^b)
//        1010 = (1*2^3) + (0*2^2) + (1*2^1) + (0*2^0)
//        101000 = (1*2^5) + (0*2^4) + (1*2^3) + (0*2^2) + (0*2^1) + (0*2^0)
//        1010 = (1*2^5) + (0*2^4) + (1*2^3) + (0*2^2) + (0*2^1) + (0*2^0) / 2^2
        System.out.println(a+" Left Shifted by "+b+" => "+c);
        System.out.println("bits of a shifted left side by b bits");

        System.out.println("\nNot Operation : ");
        c = ~a;
        System.out.println("Not of "+a+" => "+c);
        System.out.println("First perform 1's Complement if the number is negative then  perform 2's complement else return the 1's Complement");





    }
}
