package Programs.Questions;

public class bitwiseAnd {
    public static void main(String[] args) {
        int left =5;
        int right = 7;
        int ans = 2147483647;
        int i = left;

        while(ans!=0)
        {
            ans = ans & i;

            if(i>=right)
            {
                break;
            }
            i++;
        }

        System.out.println(ans);

//        System.out.println(right & (right+1));

    }
}
