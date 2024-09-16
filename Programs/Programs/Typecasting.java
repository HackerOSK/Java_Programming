package Programs;

import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


//       ** Destination type >= Source type
//       ** Both Types should be compatible

//        Implicit Casting Integer -> Float
//        float flo = input.nextInt();
//        System.out.println(flo);

//        Implicit Casting Float -> double
//        double bigdec = input.nextFloat();
//        System.out.println(bigdec);

//        Implicit long -> float
//        float num = input.nextLong();
//        System.out.println(num);

//        Implicit Byte -> Integer
//        int num1 = input.nextByte();
//        System.out.println(num1);


//       One more best example of implicit conversion:
        byte a = 50;
        byte b = 20;
        byte c = 100;
        int ans = a*b/c;
//        System.out.println(ans);
//        here a*b (50*20) = 1000 which already exceeds the limit of byte data type so while calculation the intermediate values are get store into integer (int) and final output is also get store into int
//        When any arithmetic operation perform on byte variables then it first converted into int then perform further operation and end result is also in integer

//        Java Support Unicode Language
//        System.out.println("नमस्कार माझे नाव ओंकार आहे");

//         Explicit Type Conversion :
//        Float -> int
//        int num = (int) input.nextFloat();
//        System.out.println(num);

//        double -> float
//        float num = (float) input.nextDouble();
//        System.out.println(num);

//        double -> byte
//        byte num = (byte) input.nextDouble();
//        System.out.println(num);

        int i = 10;
        char cha = 'C';
        float f = 1.9f;
        double d = 12.213;
        short s = 10;
        long l = 122220;
//      Here we can see the output of integer * character = Integer similarly float / short = float & double * long = double
        System.out.println((i*cha)+" "+(f/s)+" "+(d*l));
//        Integer + float + double = double
        System.out.println((i*cha)+(f/s)+(d*l));





    }
}
