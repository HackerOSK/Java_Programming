package Programs.Recursion;

public class PowerOf4 {
    public static void main(String[] args) {
        int n = 65;
        if(checkpwr4(n))
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
    }

//    private static boolean checkpwr4(int n) {
//        String bin = Integer.toBinaryString(n);
//        int sum = 0;
//
//        for(int i=0;i<bin.length();i++)
//        {
//            sum = sum + bin.charAt(i)-'0';
//        }
//
//        if(sum ==1 && bin.length()%2==1)
//        {
//            return true;
//        }
//
//
//        return false;
//
//    }

    static boolean checkpwr4(int n)
    {
        if(n==0)
        {
            return false;
        }
        if(n==1)
        {
            return true;
        }
        if(n%4!=0)
        {
            return false;
        }
        return checkpwr4(n/4);
    }


//    we can use this to check power of n
}
