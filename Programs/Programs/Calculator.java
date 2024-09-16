package Programs;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char op;
        float op1,op2;
        float Result = 0;
        while(true)
        {
            System.out.println("Enter the Operator (for exit press ='x') : ");
            op = in.next().trim().charAt(0);


            if(op == '+' || op == '-' || op == '*' || op == '/' || op =='%')
            {
                System.out.println("Enter the 2 Operands : ");
                op1 = in.nextFloat();
                op2 = in.nextFloat();
                if(op=='+')
                {
                    Result = op1+op2;
                }
                else if(op == '-')
                {
                    Result = op1-op2;
                }
                else if(op == '*')
                {
                    Result = op1*op2;
                }
                else if(op=='/')
                {
                    if(op2 == 0)
                    {
                        System.out.println("Invalide Input!");
                    }
                    else
                    {
                        Result = op1/op2;
                    }
                }
                else if(op == '%')
                {
                    Result=op1%op2;
                }

                System.out.println("Answer = "+Result);
            }
            else if(op == 'x')
            {
                System.out.println("Thank You! Visit Again!");
                break;
            }
            else
            {
                System.out.println("Invalide Operand");
            }
        }
    }
}
