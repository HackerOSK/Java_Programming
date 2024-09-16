package Programs.Codeft;

public class Simens {
    public static void main(String[] args) {
        int n = 15;
        int step=1;
        int s1=0;
        int s2=0;

        int i=2;
        while(true)
        {
            if(step+i>n)
            {
                step = step -i;
            }
            else if(step+i<n)
            {
                step = step + i;
            }
            else {
                s1=i;
                break;
            }
            i++;

        }
        step = -1;
        i=2;
        while(true)
        {
            if(step+i>n)
            {
                step = step -i;
            }
            else if(step+i<n)
            {
                step = step + i;
            }
            else {
                s2=i;
                break;
            }
            i++;

        }

        int j = Math.min(s1,s2);
        int sum = (j*(j+1))/2;
        System.out.println(sum);

    }
}
