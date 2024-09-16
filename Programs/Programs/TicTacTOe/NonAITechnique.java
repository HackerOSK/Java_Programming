package Programs.TicTacTOe;

import java.util.Random;
import java.util.Scanner;

public class NonAITechnique {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String board = new String();
            System.out.println("Enter your board status : ");
            board = sc.next();
            System.out.println("You current board Status");
            displayBoard(board);
            int index =  0;
            for(int i=0;i<board.length();i++)
            {
                char j = board.charAt(i);
                int v = 8-i;
                if(j=='_')
                {
                    index+=0*(int)(Math.pow(3,v));
                }else if(j=='X'){
                    index+=1*(int)(Math.pow(3,v));
                }else if(j=='O'){
                    index+=2*(int)(Math.pow(3,v));
                }else{
                    System.out.println("Invalide character entered!!");
                }
            }

            System.out.println("Index = "+index);




        }
    public static void displayBoard(String board) {
        System.out.println("___________________");
        for (int i = 0; i < board.length(); i += 3) {
            System.out.printf("|  \t%c\t  |  \t%c\t  | \t%c\t  |\n", board.charAt(i), board.charAt(i + 1), board.charAt(i + 2));
            System.out.println("----------------------------");
        }


    }

    }

