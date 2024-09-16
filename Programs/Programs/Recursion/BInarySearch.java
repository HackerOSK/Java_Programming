package Programs.Recursion;

import java.util.Arrays;

public class BInarySearch {
    public static void main(String[] args) {
        int[] array = {12,32,1,2,3,5,0,43,23,89};
        Arrays.sort(array);
        System.out.println(binaryserach(array,0,array.length-1,88));
    }

    private static boolean binaryserach(int[] array, int i, int length, int i1) {
        int mid = i + (length-i)/2;
        if(i>length)
        {
            return false;
        }
        if(array[mid]==i1)
        {
            return true;
        }
        if(array[mid]>i1)
        {
            length = mid-1;
        }
        if(array[mid]<i1)
        {
            i=mid+1;
        }
        return binaryserach(array,i,length,i1);

    }
}
