package Programs.String;

public class String_builder {
//    public static void main(String[] args) {

//    -------------------O[n^2] Time complexity to modify the string-------------------------

//        String str ="a";
//        for(int i=1;i<5;i++)
//        {
//            str = str + (char) ('a' + i);
//        }
//
//        System.out.println(str);
//    }


//    Using StringBuilder

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("a");
        for(int i=1;i<4;i++)
        {
            str.append((char)('a'+i));
        }

        System.out.println(str);
    }
}
