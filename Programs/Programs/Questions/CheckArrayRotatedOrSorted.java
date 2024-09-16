package Programs.Questions;

import java.util.Arrays;

public class CheckArrayRotatedOrSorted {
//    public static void main(String[] args) {
//        int[] arr = {2,1,3,4};
//        int[] sortedarr;
//        sortedarr = arr.clone();
//        boolean ans = false;
//        Arrays.sort(sortedarr);
//        System.out.println(Arrays.toString(sortedarr));
//        System.out.println(Arrays.toString(arr));
//        int c = 0;
//
//        for(int i=0;i<arr.length;i++)
//        {
//            c=0;
//            for(int j=0;j< arr.length;j++) {
//                if (sortedarr[j] == arr[(i + j) % arr.length]) {
//                    ans = true;
//                    c++;
//
//                } else {
//                    ans = false;
//                    c--;
//                }
//
//            }
//            System.out.println("i = "+i+" ans = "+c);
//            if(c==arr.length)
//            {
//                break;
//            }
//            ans = false;
//
//        }
//
//
//
//
//        System.out.println(ans);
//
//
//    }













//    Perfect Approach

    public static void main(String[] args) {
        int[] arr = {3,4,2,1};
        int n = arr.length;
        int count=0;
        if(arr[0]<arr[n-1])
        {
            count++;
        }
        while(n>1)
        {
            if(arr[n-2]>arr[n-1])
            {
                count++;
            }
            n--;
        }

        System.out.println(count<=1);
    }
}
