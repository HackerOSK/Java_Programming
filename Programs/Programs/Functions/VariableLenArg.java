package Programs.Functions;

import java.util.Arrays;

public class VariableLenArg {
    public static void main(String[] args) {
        fun(1,2,3,4,5,5,121,12,12,32,31,321,312,313,123,123,220);
    }
    static void fun(int ...arg)
    {
        System.out.println(Arrays.toString(arg));
    }
}
