package Programs.Questions;

import java.math.BigInteger;
import java.util.ArrayList;

public class String_to_Integer_atoi {
    public static void main(String[] args) {
        String s = "+-5";
        int neg = 0;
        int num=0;
        s=s.trim();

        if(s.length()==0 || s.charAt(0)=='.' || (s.charAt(0)>='a'&&s.charAt(0)<='z') || (s.charAt(0)>='A'&&s.charAt(0)<='Z')||(s.length()>1&& (s.charAt(0)=='+'||(s.charAt(0)=='-'))&& (s.charAt(1)=='+'||(s.charAt(1)=='-'))))
        {
            System.out.println(0);
        }
        ArrayList<Character>list = new ArrayList<>();
        for(char i : s.toCharArray())
        {
            if((i>='0' && i<='9')||(i=='-')||(i=='+'))
            {
                list.add(i);
            }
            else
            {
                break;
            }
        }

        System.out.println(list);
        if(list.get(0)=='-')
        {
            neg=1;
            list.remove(0);
        }
        else if(list.get(0)=='+')
        {
            neg=0;
            list.remove(0);
        }
        int net=list.size();
        for(int i=0;i<list.size();i++)
        {
            if( (list.get(i)=='-') || (list.get(i)=='+'))
            {

                if(i!=0)
                {
                    net=i;
                    break;
                }
                list.remove(i);

            }
        }
        ArrayList<Character> newlist = new ArrayList<>();
        for(int i=0;i<net;i++)
        {
            newlist.add(list.get(i));
        }


        System.out.println(newlist);
        num = strTonum(newlist,neg);

        System.out.println(num);







    }

    private static int strTonum(ArrayList<Character> list,int neg) {

        long num =0;

        for(int j=0;j<list.size();j++)
        {
            if(list.get(j)=='+' || list.get(j)=='-')
            {
                break;
            }
            long res = (long)((list.get(j)-'0')* Math.pow(10,(list.size()-1 - j)%list.size()));

            if(neg==0)
            {
                if(Integer.MAX_VALUE-num>=res)
                {
                    num = num + res;
                }
                else
                {
                    num = Integer.MAX_VALUE;
                    break;
                }
            }
            else if(neg==1)
            {
                res=res*-1;
                if(Integer.MIN_VALUE-num <= (res*-1)) {
                    num = num + res;
                }
                else
                {
                    num = Integer.MIN_VALUE;
                    break;
                }
            }

        }
        System.out.println(num);
        int ans= (int) num;

        return ans;
    }
}
