package Programs.BinarySearch;

public class Lower_bound {
//    Smallest or equal to number to the target number
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,7,8,12,29};
        int target  = 39;
        int ind = lowerbound(arr,target,0,arr.length-1);
        System.out.println(ind);
    }

    private static int lowerbound(int[] arr, int target, int s, int e) {
        int ans = arr.length;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] >= target) {
                if (mid < ans) {
                    ans = mid;
                }
                e = mid - 1;
            } else if (arr[mid] < target) {
                s = mid + 1;
            }
        }

        return ans;
    }
}
