package Programs.Questions;



public class FindUniqueBinaryString {

//     my Approach
//    public static void main(String[] args) {
//        String[] nums = {"000","001","110"};
//        int n = nums.length;
//        int max = Integer.MIN_VALUE;
//        int freq[] = new int[65536];
//        for(int i=0;i<n;i++)
//        {
//            int num = binaryToInt(nums[i]);
//            freq[num] = 1;
//            if(num>max)
//            {
//                max = num;
//            }
//        }
//
//        int ans = 0;
//        for(int i=0;i<65536;i++)
//        {
//            if(freq[i]==0)
//            {
//              ans = i;
//              break;
//            }
//        }
//        System.out.println(ans);
//
//
//
////        System.out.println(sum);
//        String binaryString = Integer.toBinaryString(ans);
//
//        if(binaryString.length()!=n)
//        {
//            System.out.println(modifystr(binaryString,n));
//        }
//        System.out.println(binaryString);
//
//
//    }
//
//    private static String modifystr(String binaryString,int l) {
//        System.out.println(binaryString);
//        StringBuilder ans = new StringBuilder("");
//        int n = l-binaryString.length();
//        System.out.println(n);
//        int len = binaryString.length();
//        while (n>0)
//        {
//            ans.append('0');
//            n--;
//        }
//        int i=0;
//        while (len>0)
//        {
//            ans.append(binaryString.charAt(i));
//            i++;
//            len--;
//        }
//
//        return ans.toString();
//
//    }
//
//    private static int binaryToInt(String num) {
//        int sum=0;
//        int l = num.length()-1;
//        for(int i=0;i<=l;i++)
//        {
//            sum = sum + (num.charAt(l-i)-'0')*(int)(Math.pow(2,i));
//        }
//
//        return sum;
//    }




//    Most Correct


    public static void main(String[] args) {
        String nums[] = {"111","011","001"};
        StringBuilder ans = new StringBuilder("");

        for(int i=0;i<nums.length;i++)
        {
            ans.append((char)((nums[i].charAt(i)) ^ 1));
        }

        System.out.println(ans);

    }
}
