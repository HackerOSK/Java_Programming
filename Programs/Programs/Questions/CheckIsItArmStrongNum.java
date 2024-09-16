package Programs.Questions;

import java.util.Scanner;

public class CheckIsItArmStrongNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number which you want to check whether it is an ArmStrong Number or Not");
        int num = in.nextInt();
        if(CheckNum(num))
        {
            System.out.println("Yes!! This is an ArmStrong Number.");
        }
        else
        {
            System.out.println("No!! This is not an ArmStrong Number.");
        }
    }

    static boolean CheckNum(int num) {
        int a = num;
        int res=0;
        int sum =0;
        int len = countDigi(a);
        while(num!=0)
        {
            res=num%10;
            sum=sum+pwr(res,len);
            num=num/10;
        }

        if(sum==a)
        {
            return true;
        }
        return false;


    }

    static int countDigi(int a)
    {
        int count=0;
        while(a!=0)
        {
            count++;
            a=a/10;
        }
        return count;
    }

    static int pwr(int base,int index)
    {
        int res=1;
        for(int i=1;i<=index;i++)
        {
            res=res*base;
        }
        return res;
    }
}
