package Programs.Questions;

public class Square_root {
    public static void main(String[] args) {
        int n = 16;
        long s = 0;
        long e = n/2;
        long mid=0;
        int i=1;

        while(s<=e)
        {
            mid = s + (e-s)/2;
            if(mid*mid==n)
            {
                i=0;
                break;
            }
            else if(mid*mid>n)
            {
                e=mid-1;
            }
            else
            {
                s=mid+1;
            }
        }

        if((mid*mid)>n)
        {
            System.out.println(mid-1);
        }
        else
        {
            System.out.println(mid);
        }

    }
}
