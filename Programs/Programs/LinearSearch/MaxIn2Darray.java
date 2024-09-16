package Programs.LinearSearch;

public class MaxIn2Darray {
    public static void main(String[] args) {

        int[][] arr = {
                {1,2,4,5},
                {46,234,878,0},
                {7,9,452,3},
                {100,8,90}
        };


        int max = CheckMax(arr);
        System.out.println("Maximum Element in given Array : "+max);



    }

    static int CheckMax(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for(int row=0;row<arr.length;row++)
        {
            for(int col=0;col<arr[row].length;col++)
            {
                if(arr[row][col]>max)
                {
                    max=arr[row][col];
                }
            }
        }

        return max;
    }
}
