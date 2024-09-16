package Programs.Questions;

public class count_Number_of_teams {
    public static void main(String[] args) {
        int  arr[] = {2,5,3,4,1};
        int c = 0;

        for(int i=0;i<arr.length-2;i++)
        {
            int asc = arr[i];
            int dsc = arr[i];
            int aCount=0;
            int dCount=0;
            for(int j=i+1;j<arr.length;j++)
            {
                if(asc<arr[j])
                {
                    asc = arr[j];
                    aCount++;
                }else if(dsc>arr[j])
            {
                dsc = arr[j];
                dCount++;
            }
                if(dCount==2 || aCount==2)
                {
                    c++;
                    break;
                }
            }
        }

        System.out.println(c);
    }
}
