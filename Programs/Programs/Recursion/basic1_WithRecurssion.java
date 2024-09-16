package Programs.Recursion;

public class basic1_WithRecurssion {
    public static void main(String[] args) {
//        main call
        print(1);
        System.out.println("reverse");
        printr(1);
    }
    static void print(int n)
    {
//        base condition
        if(n==5)
        {
            System.out.println(n);
            return;
        }
        System.out.println(n);
//        recursively call
        print(n+1);
    }

    static void printr(int n)
    {
//        base condition
        if(n==5)
        {
            System.out.println(n);
            return;
        }
        //        recursively call
        printr(n+1);
        System.out.println(n);

    }
}
