package Programs;

public class Ugly_number {
    public static void main(String[] args) {
        int n = 1;
        int count=0;
        int i=1;
        while(count<n)
        {
            int j = i;

            while(j > 1)
            {
                if(j % 2 == 0)
                {
                    j = j/2;
                }else if(j % 3 == 0)
                {
                    j = j/3;
                }else if(j % 5 == 0)
                {
                    j = j/5;
                }else{
                    break;
                }
            }
            if(j==1)
            {
                count++;
            }
            i++;
        }

        System.out.println(i-1);
    }
}
