package Programs.Questions;

public class ArraySortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,0};
        int res=1;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                res=0;
            }
        }
        System.out.println(res);
    }
}
