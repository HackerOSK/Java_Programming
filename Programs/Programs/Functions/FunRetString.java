package Programs.Functions;

import java.util.Scanner;

public class FunRetString {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your name : ");
        String name = in.next();
        System.out.println(Ask()+name+"?"); //Calling the ask function
    }

    static String Ask() //Defining the function
    {
        return "How are You ";
    }
}
