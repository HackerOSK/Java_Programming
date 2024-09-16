package Programs.Recursion.Striver_Playlist;

public class String_pallindrome {
    public static void main(String[] args) {
        String str = "babb";
        System.out.println(checkPallindrome(str,0,str.length()-1));
    }

    private static boolean checkPallindrome(String str,int s,int e) {
        if(s>=e)
        {
            return true;
        }
        if(str.charAt(s) != str.charAt(e) )
        {
            return false;
        }

        return checkPallindrome(str,++s,--e) ;

    }
}
