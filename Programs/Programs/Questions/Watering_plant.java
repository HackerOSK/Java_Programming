package Programs.Questions;

public class Watering_plant {
    public static void main(String[] args) {
        int[] arr = {2,2,3,3};
        int capacity = 5;
        int c = capacity;
        int i = -1;
        int step=0;
        while(i<arr.length-1)
        {
            if(arr[i+1]<=capacity)
            {
                capacity = capacity - arr[i+1];
                step++;
                i++;
            }
            else
            {
                int j = i;
                while(j!=0)
                {
                    j--;
                    step++;
                }
                step++;
                step = step + i + 1;
                capacity = c;

            }
        }
        System.out.println(step);


    }
}
