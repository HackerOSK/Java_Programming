package Programs.Questions;

public class Count_Number_of_Nice_Subarrays {
    public static void main(String[] args) {
        int arr[] = {2,2,2,1,2,2,1,2,2,2};
        int k = 2;
        System.out.println(checkOdd(arr,k));
    }

    private static int checkOdd(int[] arr, int k) {
        int s = 0;
        int x = 0;
        int e = 0;
        int y = 0;
        int count = 0;
        int arrcount = 0;
        int i=0;
        while(i<arr.length)
        {
            if(arr[i]%2!=0)
            {
                count++;
                if(count==1)
                {
                    s  = i;
                }else if(count==k)
                {
                    e=i;
                    x = e + 1;
                    while(arr[x]%2==0 )
                    {
                        x++;
                        if(x>=arr.length)
                        {
                            x--;
                            break;
                        }
                    }


                    arrcount += (((s-y)*(x-e)) + ((s-y)+(x-e)) + 1);
                    i++;
                    y = s + 1;
                    s = e;
                    count--;
                }
            }
            i++;
        }

        return arrcount;

    }
}
