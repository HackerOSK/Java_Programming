package Programs.Questions;

public class Largest_odd_in_string {
//    public static void main(String[] args) {
//        String num = "4206";
//        int i=0;
//        int res=0;
//        int oddIndex=-1;
//        int maxOdd=-1;
//        while(i<num.length())
//        {
//            int a = getInt(num.charAt(i));
//            res = (res*10) + a;
//            System.out.println(res);
//            if(res%2!=0)
//            {
//                maxOdd=res;
//                oddIndex=i;
//
//            }
//            i++;
//        }
//        System.out.println(num.substring(0,oddIndex+1));
//
//
//
//
//
//    }
//
//    static int getInt(char c) {
//        return c-'0';
//    }

    public static void main(String[] args) {
        String num = "410678";
        int i=0;
        int index=-1;
        for(i=0;i<num.length();i++)
        {
            if((num.charAt(i)-'0')%2!=0)
            {
                index = i;
            }
        }
        System.out.println(num.substring(0,index+1));
    }
}
