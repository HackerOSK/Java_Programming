package Programs.Questions;

public class ReverseInteger {
    public static void main(String[] args) {

        int num=456;
        long n = num;
        if(num<0) {
            System.out.println((int) Reverse(n,'n')*-1);
        }
        System.out.println((int) Reverse(n, 'p'));

    }

    static long Reverse(long num, char p) {
        long res =0 ;
        long rev = 0;


        if (p == 'n')
        {
        num = num*-1;
        }
        while(num>0)
        {
            res=num%10;
            rev = (rev + res)*10;
            num = num/10;
        }

        rev = rev/10;

        if(rev>=Integer.MIN_VALUE && rev<=Integer.MAX_VALUE)
        {
            return rev;
        }
        return 0;

    }
}
