package Programs.Questions;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,22,2,22,17,77,7};
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max1)
            {
                max2=max1;
                max1=arr[i];
            }
            else if(arr[i]>max2)
            {
                max2=arr[i];
            }
            if(arr[i]<min1)
            {
                min2=min1;
                min1=arr[i];
            }
            else if(arr[i]<min2)
            {
                min2= arr[i];
            }
        }

        System.out.println(max2+" "+min2);
    }


}
