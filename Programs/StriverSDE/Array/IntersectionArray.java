package StriverSDE.Array;

import java.util.ArrayList;

public class IntersectionArray {
    public static void main(String[] args) {
        int arr1[] = { 1,2,3,3,4,5,6};
        int arr2[] = {1,1,2,3,3,5,6,6,7};
        ArrayList<Integer> intersect = new ArrayList<>();
        int i=0;
        int j=0;
        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i]==arr2[j])
            {
                intersect.add(arr1[i]);
                i++;
                j++;
            }
            else if(arr1[i]<arr2[j])
            {
                i++;
            }else{
                j++;
            }
        }

        System.out.println(intersect);
    }
}
