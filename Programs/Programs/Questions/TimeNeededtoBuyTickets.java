package Programs.Questions;

import java.util.ArrayList;

public class TimeNeededtoBuyTickets {
    public static void main(String[] args) {
        int[] tickets = {84,49,5,24,70,77,87,8};

        int k = 3;
        int time =0;
//        ArrayList<Integer> ticket = new ArrayList<>();
//        for(int i:tickets)
//        {
//            ticket.add(i);
//        }
//
//        int size = ticket.size();
//
//        while(ticket.get(k)!=0)
//        {
//
//            if(ticket.get(0)==0)
//            {
//                ticket.remove(0);
//                if(k!=0)
//                {
//                    k--;
//                }
//                else
//                {
//                    k=ticket.size()-1;
//                }
//            }
//            else
//            {
//                ticket.add(ticket.get(0)-1);
//                ticket.remove(0);
//                if(k!=0)
//                {
//                    k--;
//                }
//                else
//                {
//                    k=ticket.size()-1;
//                }
//                time++;
//            }
//
//        }

        int i=0;
            while(tickets[k]>0)
            {
                if(i>=tickets.length)
                {
                    i=0;
                }
                if(tickets[i]>0) {
                    tickets[i] = tickets[i] - 1;
                    time++;
                }
                i++;

            }


        System.out.println(time);

    }
}
