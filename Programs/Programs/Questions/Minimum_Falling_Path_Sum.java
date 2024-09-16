package Programs.Questions;

import java.util.Arrays;

public class Minimum_Falling_Path_Sum {
    public static void main(String[] args) {
//        int[] arr = {3,5,1,2,6};
//        System.out.println(findMin(arr,-1));
//        System.out.println(Arrays.toString(arr));

        int[][] mat = {{100,-42,-46,-41},{31,97,10,-10},{-58,-51,82,89},{51,81,69,-51}};
        int n = -200;
        int i=1;
        int ptr = findMin(mat[0],n);
        System.out.println(ptr);
        int colptr = LinearSearch(mat[0],ptr);
        int rowptr = 0;
        int sum =ptr;

        while(i<mat.length)
        {
            int Min = findMin(mat[i],n);
            System.out.println(Arrays.toString(mat[i]));
            int rowMin= i;
            int colMin = LinearSearch(mat[i],Min);
            System.out.println(" Ptr : "+"{"+rowptr+","+colptr+"}");
            System.out.println(" Min : "+"{"+rowMin+","+colMin+"}");
            if(MinAccess(rowptr,colptr,rowMin,colMin))
            {
                rowptr = rowMin;
                colptr = colMin;
                sum = sum +Min;
                System.out.println(sum);
                n = -200;
                i++;
            }
            else
            {
                n = Min;
            }

        }

        System.out.println(sum);



    }

    static int LinearSearch(int[] ints, int min) {
        for(int i=0;i<ints.length;i++)
        {
            if(ints[i]==min)
            {
                return i;
            }
        }

        return -1;
    }

    static boolean MinAccess(int rowptr, int colptr, int rowMin, int colMin) {
//        (row + 1, col - 1), (row + 1, col), or (row + 1, col + 1)

        if((rowMin == rowptr+1 && colMin==colptr-1) || (rowMin == rowptr+1 && colMin == colptr) || (rowMin==rowptr+1 && colMin==colptr+1))
        {
            return true;
        }

        else
        {
            return false;
        }
    }

    static int findMin(int[] Arr, int target) {
        int[] arr = Arr.clone();
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;

        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]==target)
            {
                break;
            }
            if(min>arr[i])
            {
                min=arr[i];
            }
        }
        return min;

    }
}
