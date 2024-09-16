package Programs;

public class Conditionals {
    public static void main(String[] args) {
        /*
        Syntax of If-else conditionals
        if(Boolean Expression T or F)
        {
        // If true do this
        }
        else
        {
        // else do this
        }
         */

//        int s = 15000;
//        if(s>10000)
//        {
//            System.out.println("This is greater than 10000");
//        }
//        else
//        {
//            System.out.println("This is Less than 10000");
//        }






//        If-else Ladder
        int day = 4;
        if(day==1){
            System.out.println("Monday");
        } else if (day==2) {
            System.out.println("Tuesday");
        } else if (day==3) {
            System.out.println("Wednesday");
        } else if (day==4) {
            System.out.println("Thursday");
        }
        else if (day==5) {
            System.out.println("Friday");
        } else if (day==6) {
            System.out.println("Saturday");
        } else if (day==7) {
            System.out.println("Sunday");
        }
        else {
            System.out.println("Invalide day!");
        }


        }

}
