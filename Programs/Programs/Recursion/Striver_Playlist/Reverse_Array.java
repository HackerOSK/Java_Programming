package Programs.Recursion.Striver_Playlist;

import java.util.Arrays;

public class Reverse_Array {
    public static void main(String[] args) {
        int i[] = {0,1,2,3,4,5};
        reverseArr(i,0,i.length-1);
        System.out.println(Arrays.toString(i));
    }

    private static void reverseArr(int[] arr,int s,int e) {
        if(s>=e){
            return;
        }
        arr[s] = arr[s] + arr[e];
        arr[e] = arr[s] - arr[e];
        arr[s] = arr[s] - arr[e];
        reverseArr(arr,++s,--e);
    }


}
