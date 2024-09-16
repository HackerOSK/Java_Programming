package Programs.Questions;

import java.util.Arrays;

public class Length_of_LastWord {
    public static void main(String[] args) {
        String s = "Hello World  qw  ";

//        BruteForce time complexity = O[n]
//
//        boolean loop = true;
//        int i = s.length()-1;
//        System.out.println(i);
//        char[] arr = s.toCharArray();
//        int count =0;
//        while(loop && i>=0)
//        {
//            if(arr[i]==' ' && count>0)
//            {
//                loop=false;
//            }
//            else
//            {
//                if((arr[i]>='A' && arr[i]<='Z') || (arr[i]>='a' && arr[i]<='z'))
//                {
//                    count++;
//                }
//                i--;
//            }
//        }



//      BruteForce using Split function

//        String[] arr = s.split("\\s");
//        System.out.println(Arrays.toString(arr));
//        System.out.println(arr[arr.length-1].length());

//        Optimal
        int count=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)!=' ')
            {
                count++;
            }
            else if(count==0)
            {
                count=0;
            }
            else
            {
                break;
            }
        }

        System.out.println(count);
    }
}
