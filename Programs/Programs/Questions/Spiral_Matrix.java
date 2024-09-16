package Programs.Questions;

import java.util.ArrayList;

public class Spiral_Matrix {
    public static void main(String[] args) {
        int mat[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int T = 0;
        int L = 0;
        int R = mat[0].length-1;
        int B = mat.length-1;
        ArrayList<Integer>list = new ArrayList<>();

        while(T<B && L<R)
        {
            for(int i=L;i<=R;i++)
            {
                list.add(mat[T][i]);
            }
            T++;
            for(int i=T;i<=B;i++)
            {
                list.add(mat[i][R]);
            }
            R--;
            if(T>=B && L>=R)
            {
                break;
            }
            for(int i=R;i>=L;i--)
            {
                list.add(mat[B][i]);
            }
            B--;
            for(int i=B;i>=T;i--)
            {
                list.add(mat[i][L]);
            }
            L++;
        }

        System.out.println(list);
    }
}
