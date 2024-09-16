package Programs.BinarySearch;

public class Ceil_floor_fun {
    public static void main(String[] args) {
        int arr[] = {3,4,14,18,23,30};
        int target = 31;
        int c = ceil(arr,target);
        int f = floor(arr,target);
        System.out.println("Ceil : "+c);
        System.out.println("Floor : "+f);
    }

    private static int floor(int[] arr, int target) {
        int s = 0;
        int e = arr.length-1;
        int ans = 0;
        while(s<=e)
        {
            int mid = s + (e-s)/2;
            if(arr[mid]<=target)
            {
                if(ans<mid)
                {
                    ans = mid;
                }
                s = mid + 1;
            }else{
                e = mid-1;
            }
        }
        if(target<arr[ans])
        {
            ans=-1;
        }
        return ans;
    }

    private static int ceil(int[] arr, int target) {
        int ans = 0;
        int s = 0;
        int e = arr.length-1;
        while(s<=e)
        {
            int mid = s + (e-s)/2;
            if(arr[mid] >= target)
            {
                if(ans<mid)
                {
                    ans = mid;
                }
                e = mid - 1;
            }else{
                s = mid +1;
            }
        }
        if(target>arr[ans])
        {
            ans=-1;
        }
        return ans;
    }
}
