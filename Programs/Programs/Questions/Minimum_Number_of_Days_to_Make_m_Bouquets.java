package Programs.Questions;

public class Minimum_Number_of_Days_to_Make_m_Bouquets {
    public static void main(String[] args) {
        int m = 2;
        int k = 2;
        int bloomdays[] = {1,2,4,9,3,4,1};
        if((long)m*k > bloomdays.length)
        {
            System.out.println(-1);
        }else{

            int s =findMin(bloomdays);
            int e = findMax(bloomdays);
            int mid=0;
            while(s<=e)
            {
                mid = s + (e-s)/2;
                if(checkbloom(mid,m,k,bloomdays))
                {
                    e = mid - 1;
                }else {
                    s = mid + 1;
                }
            }
            System.out.println(s);


        }

    }

    private static int findMin(int[] bloomdays) {
        int min = Integer.MAX_VALUE;
        for(int i:bloomdays)
        {
            if(i<min)
            {
                min=i;
            }
        }
        return min;
    }

    private static boolean checkbloom(int mid, int m, int k, int[] bloomdays) {

        int count=0;

            int c=0;
            for(int i=0;i<bloomdays.length;i++)
            {
                if(bloomdays[i]<=mid)
                {
                    c++;
                }else{
                    count = count + (c/k);
                    c=0;
                }
            }
            count = count + (c/k);

        if(count>=m)
        {
            return true;
        }
        return false;


    }

    private static int findMax(int[] bloomdays) {
        int max = 0;
        for(int i : bloomdays)
        {
            if(i>max)
            {
                max=i;
            }
        }
        return max;
    }
}
