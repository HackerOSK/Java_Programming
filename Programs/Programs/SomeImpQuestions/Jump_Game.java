package Programs.SomeImpQuestions;
//https://leetcode.com/problems/jump-game/description/
public class Jump_Game {
    public static void main(String[] args) {
        int[] arr = {2,3,1,1,4};
        if(CanJump(arr))
        {
            System.out.println("We can Jump!!");
        }
        else
        {
            System.out.println("We cannot Jump!!");
        }
    }

    static boolean CanJump(int[] arr)
    {
        int finalState=arr.length-1;
        for(int i = arr.length-2;i>=0;i--)
        {
            if(i+arr[i]>=finalState)
            {
                finalState = i;
            }
        }

        if(finalState == 0)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}
