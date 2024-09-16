package Programs.BinarySearch;

public class SortedArrayRotationBy_X {
//    we want to find how many times the given rotated sorted array is rotated

//    here we only find the pivot index and array is always rotated by (pivot + 1)
public static void main(String[] args) {
    int[] arr = {4,5,6,7,0,1,2,3};
    int start = 0;
    int end = arr.length-1;
    while(start<=end)
    {
        int mid = start + (end-start)/2;
        if(mid>start && arr[mid-1]>arr[mid])
        {
            System.out.println(mid);
            break;
        }
        if(mid<end && arr[mid]>arr[mid+1])
        {
            System.out.println(mid+1);
            break;
        }
        else if(arr[start]>arr[mid])
        {
            end = mid-1;
        }
        else if(arr[start]<arr[mid])
        {
            start = mid;
        }

    }
}
}
