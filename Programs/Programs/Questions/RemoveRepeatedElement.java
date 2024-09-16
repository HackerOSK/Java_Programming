package Programs.Questions;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveRepeatedElement {
//    here we return the length of new array
//    public static void main(String[] args) {
//
//        int arr[] = {1,2,2,3,3,3,4,4,5,5 };
//        int n = arr.length;
//        ArrayList<Integer> list = new ArrayList<>(3);
//        int a = arr[0];
//        for(int i=0;i<n;i++)
//        {
//            if(arr[i]!=a)
//            {
//                list.add(a);
//                a=arr[i];
//            }
//            if(i==n-1)
//            {
//                list.add(a);
//            }
//        }
//
//        System.out.println(list);
//    }













//    Here we also return array with size of array
public static void main(String[] args) {
    int[] arr = {0,0,1,1,1,2,2,3,3,4};
    int n = arr.length;
    int[] res = new int[1000];
    int j=0;
    int a = arr[0];
//    System.out.println(Arrays.toString(arr));

    for(int i=0;i<n;i++)
        {
            if(arr[i]!=a)
            {
                res[j]=a;
                j++;
                a=arr[i];
            }
            if(i==n-1)
            {
                res[j]=a;
                j++;
            }
        }
    arr=null;
    arr = new int[n];
    for(int i=0;i<j;i++)
    {
        arr[i]=res[i];
    }

    System.out.println(Arrays.toString(arr));
    System.out.println(j);

//    System. out.println(Arrays.toString(arr));

}







}
