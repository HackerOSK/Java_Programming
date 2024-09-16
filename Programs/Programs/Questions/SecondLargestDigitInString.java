package Programs.Questions;

public class SecondLargestDigitInString {
//    public static void main(String[] args) {
//        String str = "abc1211";
//        int max1=-1;
//        int max2=-1;
//        for(int i=0;i<str.length();i++)
//        {
//            int digi = (int)str.charAt(i);
//            if(digi>=48 && digi<58)
//            {
//                if(digi>max1)
//                {
//                    max2=max1;
//                    max1=digi;
//                }
//                else if(digi>max2 && max1!=digi)
//                {
//                    max2=digi;
//                }
//            }
//        }
//        if(max2>=48 && max2<58) {
//            System.out.println((char) max2);
//            char a ='0';
//            int digit =(int) ((char)max2 - a);
//            System.out.println(digit);
//
//        }
//        else
//        {
//            System.out.println(-1);
//        }
//
//
//    }





















//    Best Approach :
public static void main(String[] args) {
    String str = "abc40203cz";
    int max1 = -1;
    int max2 = -1;
    for(int i=0;i<str.length();i++)
    {
        int c = str.charAt(i)-'0';
        if(c>=0 && c<=9)
        {

            if(c>max1)
            {
                max2=max1;
                max1=c;
            }
            else if(c>max2 && max1!=c)
            {
                max2=c;
            }

        }
    }

    System.out.println(max2);
}
}
