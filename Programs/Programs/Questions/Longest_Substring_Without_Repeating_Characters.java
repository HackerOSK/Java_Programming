package Programs.Questions;

public class Longest_Substring_Without_Repeating_Characters {
    public static void main(String[] args) {
        String s = "dvdf";
        StringBuilder str = new StringBuilder("");
        int max = 0;
        for(int j =0;j<s.length();j++)
        {
            char i = s.charAt(j);
            if(str.toString().indexOf(i)!=-1)
            {
                if(max<str.length())
                {
                    max=str.length();
                }
                str.delete(0,(str.toString().indexOf(i))+1);
                str.append(i);

            }
            else
            {
                str.append(i);
            }
        }
        if(max <str.length())
        {
            max=str.length();
        }

        System.out.println(max);
    }
}
