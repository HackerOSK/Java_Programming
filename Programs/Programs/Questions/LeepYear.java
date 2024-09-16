package Programs.Questions;

public class LeepYear {
    public static void main(String[] args) {
        int year = 2200;
        if((year%4==0 && year%100!=0) || (year%400==0))
        {
            System.out.println("Year is leep");
        }
        else
        {
            System.out.println("Year is NOT leep");
        }
    }
}
