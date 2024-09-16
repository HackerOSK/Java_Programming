package Programs.Questions;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class primeNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to check whether it is Prime or Not ");
        int num =in.nextInt();
        if(CheckPrime(num))
        {
            System.out.println("Yes! It is Prime!");
        }
        else
        {
            System.out.println("No! It is Not Prime");
        }
    }



    //Function

    static boolean CheckPrime(int num) {
        if(num ==0 || num == 1)
        {
            return false;
        }
        else {
            for (int i = 2; i <= sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }

    }
}
