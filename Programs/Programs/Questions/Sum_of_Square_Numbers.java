package Programs.Questions;

public class Sum_of_Square_Numbers {
    public static void main(String[] args) {
        int c = 3;



//        TLE
//        int i =1;
//        while(i*i <= c)
//        {
//            i++;
//        }
//
//        for(int j=i;j>=0;j--) {
//            int n = j;
//            int start = j;
//            int end =  i;
//            while (start <= end) {
//                int mid = start + (end - start) / 2;
//                if(mid*mid +n*n == c )
//                {
//                    System.out.println("{"+mid+","+n+"}");
//                    System.out.println(true);
//                    break;
//                }else if(mid*mid + n*n < c)
//                {
//                    start++;
//                }else{
//                    end--;
//                }
//            }
//        }
//        System.out.println("False");


        int num = 808201;
        int s = 0;
        int e = (num/2)+1;
        while(s<=e)
        {
            double mid = s + (e-s)/2;
            if(mid*mid==num)
            {
                System.out.println(mid);
                break;
            }else if(mid*mid<num)
            {
                s=(int)(mid+1);
            }else{
                e=(int)(mid-1);
            }

        }













    }
}
