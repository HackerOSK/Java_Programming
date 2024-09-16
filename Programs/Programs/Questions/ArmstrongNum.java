package Programs.Questions;



public class ArmstrongNum {
    public static void main(String[] args) {
        //Printing All 3-digit ArmStrong Number
        ThreeDigiArmStrong();
    }

    static void ThreeDigiArmStrong() {
        for(int i=100;i<=999;i++)
        {
            if(checkArmStrong(i))
            {
                System.out.println(i);
            }

        }
    }

    static boolean checkArmStrong(int num)
    {
        int sum=0;
        int res=0;
        int a =num;
        while(num!=0)
        {
            res = num%10;
            sum = sum + pwr(res,3);
            num=num/10;
        }

        if(sum==a)
        {
            return true;
        }
        else
        {
            return false;
        }

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
