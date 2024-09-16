package Programs.Questions;

import java.util.Scanner;

public class Minimum_Number_of_Chairs_in_a_Waiting_Room {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.next();
        int sum =0;
        int Max =0;
        for(char i : inp.toCharArray())
        {
            if(i=='E')
            {
                sum++;
                if(sum>Max)
                {
                    Max=sum;
                }
            }
            else if(i=='L')
            {
                sum--;
            }
        }

        System.out.println(Max);
    }
}
