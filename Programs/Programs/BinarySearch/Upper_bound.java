package Programs.BinarySearch;

public class Upper_bound {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,10,10,10,23,51};
        int target = 10;
        int s = 0;
        int e = arr.length-1;
        int ans = arr.length;
        while(s<=e)
        {
            int mid = s + (e-s)/2;
            if(arr[mid]<=target)
            {
                s = mid + 1;
            }else
            {
                if(mid<ans)
                {
                    ans = mid;
                }
                e = mid-1;
            }
        }

        System.out.println(
                arr[ans]
        );
    }
}
