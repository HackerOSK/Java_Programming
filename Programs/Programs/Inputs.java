package Programs; // Packages are nothing but folders in which the current java program is present

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        System.out.println("Hello World!");
//        Here System is one of the class of java lang in which out is standard output stream like output buffer similar to monitor output
        Scanner input = new Scanner(System.in);
//        System.in here in denotes standard input buffer or input stream like keyboard input
        System.out.println("You Entered string : "+ input.nextLine());
//        Here point to be noted is that nextLine() this function takes the complete string till "\n" character as a input string but next() function only takes string input till the " " character.
//        And we know all this scanner class function takes inputs directly from the system input buffer so nextLine() function not work if we take any of other input before this
//        Because : it takes input from input buffer till it not receive the "\n" but if there is one input before nextLine() function then the nextLine() function sense the "\n" character of previous input and take it as ending character and it results in not taking any input

        System.out.println("Enter the Integer");
        System.out.println("You Entered number : "+ input.nextInt());
        System.out.println("Enter the Float");
        System.out.println("You Entered floating number : "+ input.nextFloat());
        System.out.println("Enter the double");
        System.out.println("You Entered double : "+ input.nextDouble());




    }
}
