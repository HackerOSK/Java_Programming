package Programs.Recursion.Questions.Easy;

public class printNum {
    public static void main(String[] args) {
        int n = 10;
        ReverseprintNum(n);
        System.out.println();
        PrintTilln(n);
    }

    static void ReverseprintNum(int n)
    {
        if(n == 0)
        {
            return;
        }
        System.out.print(n+" ");
        ReverseprintNum(n-1);
    }

    static void PrintTilln(int n)
    {
        if(n==0)
        {
            return;
        }
        PrintTilln(n-1);
        System.out.print(n+" ");

    }
}
