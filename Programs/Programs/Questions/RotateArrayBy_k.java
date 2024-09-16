package Programs.Questions;

import java.util.Arrays;

public class RotateArrayBy_k {
//    right rotation of array by 'k'
public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,6,7};
    int n = arr.length;
    int[] res = new int[n];
    int k = 3;
    for(int i=0;i<n;i++)
    {
        res[(i+k) % n] = arr[i];
    }

    System.out.println(Arrays.toString(res));
    arr = res.clone();
    System.out.println(Arrays.toString(arr));

}
}
