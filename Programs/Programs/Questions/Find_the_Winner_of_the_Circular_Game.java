package Programs.Questions;

import java.util.Arrays;

public class Find_the_Winner_of_the_Circular_Game {
    public static void main(String[] args) {
        int n = 6;
        int k = 5;
        int arr[] = new int[n];
        for(int i=1;i<=n;i++)
        {
            arr[i-1] = i;
        }
        System.out.println(Arrays.toString(arr));
        while(n>1)
        {
            int res = k%n;
            if(res==0)
            {
                res = n-1;
                System.out.println(res);
                arr[res] = -1;
            }else {
                res = res -1;
                System.out.println(res);
                arr[res] = -1;
            }
//            System.out.println(Arrays.toString(arr));
//            System.out.println(res);
            makeArr(arr,res,n);
//            System.out.println("------------");
//            System.out.println(Arrays.toString(arr));


            n--;
        }




//        5,6,7,1,2,3,-1

//        1,2,3,-1,4,5 => 4,5,1,2,3,-1
//        1,-1,2,3,4,5 => 2,3,4,5,1,-1

        System.out.println(arr[0]);



    }

    private static void makeArr(int[] arr,int ind,int n) {
        int ans [] = new int[arr.length];
        int len = arr.length;
       int i  = (ind+1)%len;
        int j=0;
        while(i!=ind)
        {
            if(i<n) {
                ans[j] = arr[i];
                j++;
            }

            i++;
            i=i%len;
        }
        ans[j] = arr[i];

        System.out.println(Arrays.toString(ans));
        j=0;

        for(int k : ans)
        {
//            System.out.println(k);
            arr[j] = k;
            j++;
        }
    }
}
