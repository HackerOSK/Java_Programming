package Programs.Questions;

public class Furthest_Building_You_Can_Reach {
    public static void main(String[] args) {
        int[] h = {4,2,7,6,9,14,12};
        int b = 5;
        int l = 1;
        int current = h[0];
        for(int i=1;i<h.length;i++)
        {
            if(current<=h[i])
            {
                if(h[i]-current>=b)
                {
                    if(l!=0)
                    {
                        l--;
                    }
                    else if(b==(h[i]-current))
                    {
                        b = 0;
                    }
                    else
                    {
                        System.out.println(i-1);
                    }
                }
                else if(h[i]-current<b)
                {
                    b = b - (h[i]-current);
                }
                else
                {
                    System.out.println(i-1);
                }
            }
            current = h[i];
        }
        System.out.println(h.length-1);
    }
}
