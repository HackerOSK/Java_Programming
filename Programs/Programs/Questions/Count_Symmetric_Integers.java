package Programs.Questions;

public class Count_Symmetric_Integers {
    public static void main(String[] args) {
            int low = 1;
            int count = 0;
            int high = 100;
            for(int i=low;i<=high;i++)
            {
                int sum1 = 0;
                int sum2 = 0;
                String str = Integer.toString(i);
                if(str.length()%2==0) {
                    for (int j = 0; j <str.length();j++)
                    {
                        if(j<str.length()/2)
                        {
                            sum1 = sum1 + str.charAt(j)-'0';
                        }
                        else {
                            sum2 = sum2 + str.charAt(j) - '0';
                        }
                    }
                    if(sum1==sum2)
                    {
                        count++;
                    }
                }

            }
        System.out.println(count);
    }
}
