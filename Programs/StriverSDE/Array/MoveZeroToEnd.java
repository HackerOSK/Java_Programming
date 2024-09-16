package StriverSDE.Array;

import java.util.Arrays;

public class MoveZeroToEnd {
    public static void main(String[] args) {
        int arr[] = {1,0,2,3,4,0,5,0,6,7};
        int i=-1;
        for(int k=0;k<arr.length;k++)
        {
            if(arr[k]==0)
            {
                i=k;
                break;
            }
        }
        if(i==-1)
        {
            System.out.println("Already Done");
            System.out.println(Arrays.toString(arr));
        }
        else{
            while(i<arr.length)
            {
                for(int j=i+1;j<arr.length;j++)
                {
                    if(arr[j]!=0)
                    {
                        swap(arr,i,j);

                        break;
                    }
                }
                i++;
            }
        }

        System.out.println(Arrays.toString(arr));

    }

    private static void swap(int[] arr, int i, int j) {
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
