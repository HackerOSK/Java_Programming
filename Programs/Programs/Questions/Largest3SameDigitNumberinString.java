package Programs.Questions;

public class Largest3SameDigitNumberinString {
    public static void main(String[] args) {
        String str = "2300019";
        int max = Integer.MIN_VALUE;
        String Substr="";
        String ans ="";
        for(int i=0;i<str.length()-2;i++)
        {
            Substr = str.substring(i,i+3);
            if(isGood(Substr))
            {
                if(max<(Substr.charAt(0)-'0'))
                {
                    max = Substr.charAt(0)-'0';
                    ans = Substr;
                }
            }
        }

        System.out.println(ans);
    }

    static boolean isGood(String substr) {
        for(int i=0;i<2;i++)
        {
            if(substr.charAt(i)!=substr.charAt(i+1))
            {
                return false;
            }
        }

        return true;
    }
}
