package Programs.BinarySearch;

public class FindPivot {
    public static void main(String[] args) {
        int[] arr = {9,2,2,9};
        int start =0;
        int end = arr.length-1;
        int mid=0;
        if(arr[start]<arr[end])
        {
            System.out.println(arr[end]);
        }
        else {
            while (start <= end) {
                mid = start + (end - start) / 2;
                if (mid < end && (arr[mid] > arr[mid + 1])) {
                    System.out.println(arr[mid]);
                    break;
                }if (mid > start && (arr[mid] < arr[mid - 1])) {
                    System.out.println(arr[mid - 1]);
                    break;
                }if (arr[start] >= arr[mid]) {
                    end = mid - 1;
                } else{
                    start = mid+1;
                }
            }
        }



    }
}
