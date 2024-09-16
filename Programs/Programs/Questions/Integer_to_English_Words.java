package Programs.Questions;

import java.util.ArrayList;
import java.util.HashMap;

public class Integer_to_English_Words {
    public static void main(String[] args) {
        int num = 12233;
        String places[] = {"Hundred","Thousand","Million","Billion"};
        String tens[] = new String[10];
        tens[2] = "Twenty";
        tens[3] = "Thirty";
        tens[4] = "Forty";
        tens[5] = "Fifty";
        tens[6] = "Sixty";
        tens[7] = "Seventy";
        tens[8] = "Eighty";
        tens[9] = "Ninety";

        String unit[] = new String[10];
        unit[1] = "One";
        unit[2] = "Two";
        unit[3] = "Three";
        unit[4] = "Four";
        unit[5]="Five";
        unit[6] ="Six";
        unit[7] = "Seven";
        unit[8]="Eight";
        unit[9] ="Nine";

        String aftTen[] = new String[10];
        aftTen[1]="Eleven";
        aftTen[2]="Twelve";
        aftTen[3]="Thirteen";
        aftTen[4]="Fourteen";
        aftTen[5]="Fifteen";
        aftTen[6]="Sixteen";
        aftTen[7]="Seventeen";
        aftTen[8]="Eighteen";
        aftTen[9]="Nineteen";

        ArrayList<Integer> list = new ArrayList<>();
        while(num>0)
        {
            list.add(num%10);
            num=num/10;
        }

        System.out.println(list);

//        System.out.println(list);

        int i=0;
        int j=2;
        int c=0;
        StringBuilder ans=new StringBuilder();
        while(i<list.size()) {
            int u = list.get(i);
            c++;
        for(int k=i;k<=j;k++)
        {c++;
            int Num = list.get(k);
            if(Num==1 && c%3==2)
            {
                ans.append(aftTen[u]);
            }if(Num==0 || k==list.size()-1)
        {
            ans.append(" ");
            ans.append(unit[u]);
        }
                if(c%3==2){
                ans.append(" ");
                ans.append(unit[u]);
                ans.append(" ");
                ans.append(tens[Num]);
            }

            if(c%3==0) {
                ans.append(" ");
                ans.append(places[(c / 3) - 1]);
                ans.append(" ");
                ans.append(unit[Num]);
            }
        }
        i=j;
        j=j+(3-(j+3)%(list.size()-1));
        i++;
        }



        System.out.println(ans);

    }
}
