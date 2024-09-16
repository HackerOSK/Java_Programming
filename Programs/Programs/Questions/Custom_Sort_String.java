package Programs.Questions;

public class Custom_Sort_String {
    public static void main(String[] args) {
        String order = "cba";
        String s = "abcd";
        StringBuilder ans = new StringBuilder("");

        int[] freq = new int[26];
        for(char i : s.toCharArray())
        {
            freq[i-'a']++;
        }
        for(char i : order.toCharArray())
        {
            for(int j=0;j<freq[i-'a'];j++)
            {
                ans.append(i);
            }
            freq[i-'a']=0;
        }

        for(int i=0;i<26;i++)
        {
            if(freq[i]>0)
            {
                for(int j=0;j<freq[i];j++)
                {
                    ans.append((char)(i+'a'));
                }
            }
        }

        System.out.println(ans);
    }
}
