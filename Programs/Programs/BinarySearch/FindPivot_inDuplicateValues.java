package Programs.BinarySearch;

public class FindPivot_inDuplicateValues {
    public static void main(String[] args) {
        int[] arr = {4,5,6,1,2,3};
//        {1,2,2,3,4,4,5,6,6}
        int start = 0 ;
        int end= arr.length-1;
        if(arr[start]<arr[end])
        {
            System.out.println(-1);
        }
        else
        {
        while(start<=end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                System.out.println(mid);
                break;
            }
            if (mid > start && arr[mid - 1] > arr[mid]) {
                System.out.println(mid - 1);
                break;
            } else if (arr[start] > arr[mid]) {
                end = mid - 1;
            } else if (arr[start] <= arr[mid]) {
                start = mid;
            }
        }
        }

    }

}
