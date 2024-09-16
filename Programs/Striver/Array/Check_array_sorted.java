package Striver.Array;

public class Check_array_sorted {
    public static void main(String[] args) {
        int[] arr ={1,2,1,4,5,1};
        int[] arrs = {0,3,5,7,12,90};

        boolean isSorted = checkSorted(arr);
        boolean isSorted1 = checkSorted(arrs);
        System.out.println(isSorted);
        System.out.println(isSorted1);

    }

    static boolean checkSorted(int[] arrs) {
        int l = arrs.length;



            for(int i=1;i<l;i++)
            {
                if(arrs[i-1]>arrs[i])
                {
                    return false;
                }
            }

        return true;
    }
}
