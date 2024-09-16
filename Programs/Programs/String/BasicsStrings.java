package Programs.String;

import java.util.ArrayList;
import java.util.Arrays;

public class BasicsStrings {
//    public static void main(String[] args) {
//        String a = "Omkar";
//        String b = "Omkar";
//        System.out.println(a==b); // true
//
//    }

//    public static void main(String[] args) {
//        String a = "Omkar";
//        System.out.println(a);  // Omkar
//        a = "Om";
//        System.out.println(a);  // Om
//
//    }

//    public static void main(String[] args) {
////        formated String
//        String name = "Omkar";
//        System.out.printf("My name is %s",name);  // My name is Omkar
//    }

//    public static void main(String[] args) {
////        Operation on String or character
//
////        Adding 2 Strings
//        System.out.println("a" + "b"); // ab
////        Adding 2 characters
//        System.out.println('a' + 'b'); // 195
////        Adding String & character
//        System.out.println("a" + 'a'); // aa
////        Adding Character & Integer
//        System.out.println('a' + 3);   // 100
////        Adding String & Integer
//        System.out.println("a" + 5);   // a5
//
////       Adding String & ArrayList
//        System.out.println("Omkar"+ new ArrayList<Integer>(10));
////        Adding 2 objects
//        System.out.println(new Integer(56)+""+new ArrayList<>(5));  // 56[]
//
//
//
//    }

    public static void main(String[] args) {
        String s1 = new String("Om");
        String s2 = new String("Om");
//        String s2 = "Om";
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);

    }

}
