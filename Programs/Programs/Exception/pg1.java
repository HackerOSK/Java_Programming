package Programs.Exception;

public class pg1 {
    public static void main(String[] args) {
        int a =10;
        int b= 0;
        int div = 0;
        int[] arr = {1,2,3,4};
        try
        {
            System.out.println(arr[4]);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        System.out.println("hello world!");
    }
}
