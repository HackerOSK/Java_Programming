package Programs.Questions;

public class Magnetic_Force_Between_Two_Balls {
    public static void main(String[] args) {
        int position[] = {1,2,3,4,7};
        int m = 2;
//        0 1 2 3 4 5 6
        int a = minArr(position);
        int s = minArr(position);
        int e = maxArr(position);

        while(s<=e)
        {
            s = present(s,a,e);
            System.out.println(s);
            s+=m;
        }










    }

    private static int present(int s,int l,int h) {
        while(l<=h)
        {
            int mid = l + (h-l)/2;
            if(mid == s)
            {
                return mid;
            }else if(mid>s)
            {
                h = mid-1;
            }else{
                l = mid +1;
            }
        }
        return s;
    }

    private static int maxArr(int[] position) {
        int max = 0;
        for(int i : position)
        {
            if(i>max)
            {
                max = i;
            }
        }
        return max;
    }

    private static int minArr(int[] position) {
        int min = Integer.MAX_VALUE;
        for(int i : position)
        {
            if(i<min)
            {
                min = i;
            }
        }
        return min;
    }
}
