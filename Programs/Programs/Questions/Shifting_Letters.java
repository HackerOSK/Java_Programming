package Programs.Questions;

public class Shifting_Letters {
    public static void main(String[] args) {
        String s = "mkgfzkkuxownxvfvxasy";
        StringBuilder ans = new StringBuilder(s);
        int[] shift = {505870226,437526072,266740649,224336793,532917782,311122363,567754492,595798950,81520022,684110326,137742843,275267355,856903962,148291585,919054234,467541837,622939912,116899933,983296461,536563513};
        int l = shift.length-1;
        int temp = 0;
        int shiftletter = shift[l]%26;
        while(l>=0)
        {
            shiftletter = temp + shift[l]%26;
            temp = shiftletter;
            if(shiftletter%26<= 'z' - ans.charAt(l))
            {
                ans.setCharAt(l,(char)(ans.charAt(l)+shiftletter%26));
            }
            else
            {
                shiftletter = shiftletter%26;
                shiftletter = shiftletter - ('z'- ans.charAt(l));
                if(shiftletter!=0)
                {
                    ans.setCharAt(l,(char)('a'+shiftletter-1));
                }
            }
            l--;
        }



        System.out.println(ans);
        System.out.println(shiftletter);
    }
}
