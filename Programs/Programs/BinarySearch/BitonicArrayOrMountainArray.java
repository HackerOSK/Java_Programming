package Programs.BinarySearch;

public class BitonicArrayOrMountainArray {
    //Find the peak of mountain array
//    [0,1,3,5,4,3,2]   peak
    public static void main(String[] args) {
        int[] arr = {0,2,1,0};
        int start = 0;
        int end= arr.length-1;
        int mid=0;
        while(start<=end)
        {
            mid = start + (end-start)/2;
            if((mid==0 && arr[mid+1]<arr[mid]) ||(mid==arr.length-1 && arr[mid-1]<arr[mid]))
            {
                System.out.println(arr[mid]);
                break;
            }
            else if((mid==0 && arr[mid+1]>arr[mid]) ||(mid==arr.length-1 && arr[mid-1]>arr[mid]))
            {
                if(mid==0)
                {
                    start++;
                }
                else
                {
                    end--;
                }
            }
            else if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1])
            {
                System.out.println(arr[mid]);
                break;
            }
            else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1])
            {
                start = mid+1;
            }
            else if(arr[mid]<arr[mid-1] && arr[mid]>arr[mid+1])
            {
                end = mid-1;
            }
        }



    }

}
