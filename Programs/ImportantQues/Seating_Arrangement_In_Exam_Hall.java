package ImportantQues;

//Semester exams are going on for university students. Examiners noticed that a group of people are trying to cheat.
// They marked students of that group as ‘1’ and students of another group ( who are not cheating ) as ‘0’
//We can reduce cheating by not allowing students from group 1 to sit together,
// means no two students from group 1 can sit together.
// Seatings are marked using above conditions.
// Your task is to give the seating placement of nth possibility
// Possibility order from 1 to 10 is given below
// [1  10  100  101  1000  1001  1010  10000  10001  10010]

import java.util.Scanner;

public class Seating_Arrangement_In_Exam_Hall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of test Cases : ");
        int tc = sc.nextInt();
        while(tc>0) {
            int pos = sc.nextInt();
            Possibility(pos);
            tc--;
        }
    }

    private static void Possibility(int pos) {
        int c = 0;
        int i=0;
        String b = "";
        while(c<=pos)
        {
            String s = Integer.toString(i,2);
            if(!s.contains("11"))
            {
                b=s;
                c++;
            }
            i++;
        }
        System.out.println(b);
    }
}
