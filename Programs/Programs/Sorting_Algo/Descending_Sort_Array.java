package Programs.Sorting_Algo;

import java.util.Arrays;
import java.util.Collections;

public class Descending_Sort_Array {
    public static void main(String[] args) {
        Integer arr[] = {12,3,5,1,52,89};
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }
}
