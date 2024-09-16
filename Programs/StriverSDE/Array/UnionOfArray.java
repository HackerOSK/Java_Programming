package StriverSDE.Array;

import java.util.ArrayList;

public class UnionOfArray {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,6,9};
        int arr2[] = {1,3,5,7,8,9};
        int i=0;
        int j=0;
        ArrayList<Integer> union = new ArrayList<>();
        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i]<=arr2[j])
            {
                if(union.size()>0 && union.get(union.size()-1)!=arr1[i]) {
                    union.add(arr1[i]);
                }else{
                    if(union.size()==0)
                    {
                        union.add(arr1[i]);
                    }
                    i++;
                }
            }else if(arr1[i]>arr2[j])
            {
                if(union.size()>0 && union.get(union.size()-1)!=arr2[j]) {
                    union.add(arr2[j]);
                }else{
                    if(union.size()==0)
                    {
                        union.add(arr2[j]);
                    }
                    j++;
                }
            }
        }

        while(j<arr2.length)
        {
            if(union.size()>0 && union.get(union.size()-1)!=arr2[j]) {
                union.add(arr2[j]);
            }else{
                if(union.size()==0)
                {
                    union.add(arr2[j]);
                }
                j++;
            }
        }

        while(i<arr1.length)
        {
            if(union.size()>0 && union.get(union.size()-1)!=arr1[i]) {
                union.add(arr1[i]);
            }else {
                if (union.size() == 0) {
                    union.add(arr1[i]);
                }
                i++;
            }
        }

        System.out.println(union);
    }
}
