package Programs.LinearSearch;

import java.util.Arrays;

public class LaserBeamPrb {
    public static void main(String[] args) {
        String[] bank = {"011001","000000","010100","001000"};
        int[] lasercount = new int[bank.length];
        int rem=0;
        int comb=0;
        for(int i=0;i<bank.length;i++)
        {
//            System.out.print(count(bank[i])+" ");
            lasercount[i] = count(bank[i]);
        }
        System.out.println(Arrays.toString(lasercount));

        for(int i=0;i<lasercount.length-1;i++)
        {
            if(lasercount[i+1]==0 || lasercount[i]==0)
            {
                rem = lasercount[i]+lasercount[i+1];
                lasercount[i+1]=rem;
            }
            else
            {
                rem = lasercount[i]*lasercount[i+1];
                comb=comb+rem;
            }
            rem=0;
        }

        System.out.println(comb);

    }
    static int count(String str)
    {
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='1')
            {
                count++;
            }
        }

        return count;
    }
    }

