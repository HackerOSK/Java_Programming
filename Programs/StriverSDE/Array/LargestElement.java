package StriverSDE.Array;

public class LargestElement {
    public static void main(String[] args) {
        int arr[] = {1,5,2,6,12,4,90};
        int largest = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(largest<arr[i])
            {
                largest=arr[i];
            }
        }

        System.out.println(largest);
    }
}
