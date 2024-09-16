package Programs.Questions;

import java.util.Arrays;

public class RearrangeArrayElementsbySign {
    public static void main(String[] args) {
        int[] arr = {-1,1};
//            output {3,-2,1,-5,2,-4}
//        int flag = 1;
//        int i =0;
//
//        while(i<arr.length)
//        {
//            if((arr[i]>=0 && flag==1) || (arr[i]<0 && flag==0))
//            {
//                i++;
//            }
//            else
//            {
//                int j = i;
//                if(flag==1)
//                {
//                    while(arr[j]<0)
//                    {
//                        j++;
//                    }
//                }
//                else
//                {
//                    while(arr[j]>=0)
//                    {
//                        j++;
//                    }
//                }
//                while(j!=i) {
//                    int temp = arr[j];
//                    arr[j] = arr[j-1];
//                    arr[j-1] = temp;
//                    j--;
//                }
//
//                i++;
//            }
//            if(flag==1)
//            {
//                flag=0;
//            }
//            else
//            {
//                flag=1;
//            }
//        }






        int p =0;
        int n = 1;
        int[] ans = new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>=0)
            {
                ans[p]=arr[i];
                p+=2;
            }
            else
            {
                ans[n]=arr[i];
                n+=2;
            }
        }

        System.out.println(Arrays.toString(ans));





    }
}
