package Programs.Questions;

import java.util.Arrays;

public class ContestQues {
        public static void main(String[] args) {
            int[] arr = {8,4,2,30,15};
            System.out.println("Before : "+ Arrays.toString(arr));
            bubbleSort(arr);
            System.out.println("After : "+ Arrays.toString(arr));
            System.out.println(isSorted(arr));
        }

        static void bubbleSort(int[] arr) {
            int c = 0;
            for(int i=0;i<arr.length-1;i++)
            {
                for(int j=1;j<arr.length-i;j++)
                {
                    if(arr[j-1]>arr[j] && CheckCount(arr[j-1],arr[j]))
                    {
                        arr[j-1] = arr[j-1] * arr[j];
                        arr[j] = arr[j-1] / arr[j];
                        arr[j-1] = arr[j-1] / arr[j];
                        c++;
                    }
                }
                if(c==0)
                {
                    break;
                }
                else {
                    c = 0;
                }
            }

        }

    static boolean isSorted(int[] arr) {
            for(int j=0;j<arr.length-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    return false;
                }

            }

            return true;
    }

    static boolean CheckCount(int i, int i1) {
            String a = Integer.toBinaryString(i);
            String b = Integer.toBinaryString(i1);
            int count1=0;
            int count2=0;
            for(int j=0;j<a.length();j++)
            {
                if(a.charAt(j)=='1')
                {
                    count1++;
                }
            }
            for (int j=0;j<b.length();j++)
            {
                if(b.charAt(j)=='1')
                {
                    count2++;
                }
            }

            if(count1==count2)
            {
                return true;
            }
            return false;
    }


}


