package Programs.Questions;

public class ReverseTheNumber {
    public static void main(String[] args) {
        int num = 1534236469;
        if(!InRange(num))
        {
            System.out.println(0);
        }
        if(num<0) {
            System.out.println(Reverse(num, 'n'));
        }
        else{
            System.out.println(Reverse(num, 'p'));
        }
    }

    static int Reverse(int num,char s) {
        if(s=='n')
        {
            num=num*(-1);
        }
        int res;
        int result = 0;
        while(num>0)
        {
            res = num%10;
            result = (result + res)*10;
            num=num/10;
            if(!InRange(result))
            {
                return 0;
            }
        }
        System.out.println(result/10);


            if (s == 'n') {
                return (result / 10) * -1;
            }
            return (result / 10);



    }

    static boolean InRange(int i) {
        if(i>Integer.MIN_VALUE && i<Integer.MAX_VALUE)
        {
            return true;
        }
        return false;
    }
}
