package Programs.Questions;

public class MaxInArray {
    public static void main(String[] args) {
        int arr[] = {1,2,344,2341,123,12};
        System.out.println("Maximum Element in Above array : "+Max(arr));
        System.out.println("Maximum Element in Between 0-2 : "+MaxInRange(arr,0,2));
    }

    public static int Max(int[] arr)
    {
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }

        return max;
    }

    static int MaxInRange(int[] arr,int start,int end)
    {
        int max = arr[0];
        for(int i=start;i<=end;i++){
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }

        return max;

    }
}
