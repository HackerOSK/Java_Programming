package Programs;

import java.util.Scanner;

public class Alphbet_CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the character which case you want to check : ");
        char Character = in.next().trim().charAt(0);
//        trim() function is use to remove all extra space at start and end of the input
//        charAt() function is use to convert string input to character
//        System.out.println(Character);

//        As we know Capital case Character Are start from ASCII 65 = "A" and ends at 91 ="Z"
//        & small case Characters are start from ASCII 97 = "a" and ends at 123 = "z"


//        Method 1
//        int ch = (int) Character;
//        if(ch>= 65 && ch<=91)
//        {
//            System.out.println("Character "+Character + " is in Upper Case");
//        }
//        else if(ch >= 97 && ch <= 123)
//        {
//            System.out.println("Character "+Character+" is in Lower Case");
//        }
//        else
//        {
//            System.out.println("Not a Alphabetical Character");
//        }


//        Method 2
        if(Character >= 'A' && Character<='Z' )
        {
            System.out.println("Character "+Character + " is in Upper Case");
        } else if (Character >= 'a' && Character <= 'z') {
            System.out.println("Character "+Character+" is in Lower Case");
        }
        else
        {
            System.out.println("Not a Alphabetical Character");
        }

    }
}
