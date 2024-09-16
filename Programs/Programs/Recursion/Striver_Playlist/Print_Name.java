package Programs.Recursion.Striver_Playlist;

import java.util.Scanner;

public class Print_Name {
    static int c = 0;
    public static void main(String[] args) {
//        Printing name 5 times
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        printName(name);
    }

     static void printName(String name) {
        if(c>4)
        {
            return;
        }
        System.out.println(name);
        c++;
        printName(name);
    }
}
