package Programs.BinarySearch;

public class FindPeak {
    public static void main(String[] args) {
//        Bi-tonic Array
        int[] arr = {5,6,1,2,3,4};
        int start = 0;
        int end = arr.length-1;
        int mid=0;
        while(start<end)
        {
            mid = start +(end-start)/2;
            if(arr[start]<arr[mid])
            {
                end=mid;
            }
            else
            {
                start=mid+1;
            }
        }
        System.out.println(start);

    }
}
