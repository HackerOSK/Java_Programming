package Programs.Questions;

public class add_string {
    public static void main(String[] args) {
        String num1 = "0";
        String num2 = "0";
        StringBuilder n1 = new StringBuilder("");
        StringBuilder n2 = new StringBuilder("");
        StringBuilder ans = new StringBuilder("");
        int len1 = num1.length();
        int len2 = num2.length();
        int carry =0;


        if(len1>len2)
        {
            while(len2!=len1)
            {
                n2.append('0');
                len2++;
            }
        }
        else if(len1<len2)
        {
            while(len1!=len2)
            {
                n1.append('0');
                len1++;
            }
        }

        for(char i : num1.toCharArray())
        {
            n1.append(i);
        }

        for(char i : num2.toCharArray())
        {
            n2.append(i);
        }

        System.out.println(len1);







        for(int i=len1-1;i>=0;i--)
        {
            int sum = (n1.charAt(i)-'0')+(n2.charAt(i)-'0')+carry;
            if(sum>9)
            {
                ans.append((char)('0'+sum%10));
                sum = sum/10;
                carry = sum%10;
            }
            else
            {
                ans.append((char)('0'+sum));
            }
        }

        System.out.println(ans.reverse());
    }
}
