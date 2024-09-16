package Striver.Array;

public class Check_array_sorted_and_rotated {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7};
        int count=0;
        for(int i =1;i<arr.length;i++)
        {
            if(arr[i-1]>arr[i])
            {
                count++;
            }
        }

        if(count==0)
        {
            System.out.println("Sorted but Not Rotated");
        }
        else if(count==1)
        {
            System.out.println("Sorted as well as Rotated");
        }
        else {
            System.out.println("Not Sorted!");
        }
    }
}
