package Programs.Questions;

public class Find_the_Pivot_Integer {
    public static void main(String[] args) {
        int x = 1;
        int i =1;
        int sum1=0;
        int sum2=0;
        while(i<=x)
        {
            sum1 = sum1 + i;
            sum2 = findsum(i,x);

            if(sum1==sum2)
            {
                System.out.println(i);
                break;
            }
            i++;
        }
            
    }

    private static int findsum(int i, int x) {
        int sum=0;
        for(int j=i;j<=x;j++)
        {
            sum = sum + j;
        }
        return sum;
    }
}
