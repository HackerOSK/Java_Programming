package Programs.TicTacTOe;

import java.util.Arrays;
import java.util.Scanner;

public class MyLogic {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int board[] = new int[9];
//        1 = X
//        0 = O
//        2 = _

//        0  |  1  |  2
//        3  |  4  |  5
//        6  |  7  |  8

//        X = Human
//        O = AI




        System.out.println("Enter the current board status  ");
        System.out.println(" X => 1 \n O => 2 \n _ => 3");
        int winner  = 2;
        for(int i=0;i<9;i++)
        {
            board[i] = sc.nextInt();
        }

        System.out.println("Your Board Position : ");
        System.out.println(Arrays.toString(board));

//        AI Playing
        int move = 0;
        move = Winningmove(board);
        if(move==0)
        {
            move = BlockingMove(board);
        }if(move==0)
        {
            move=NitherWinningNorBlockingMove(board);
        }

        System.out.println("New Board Position : ");
        System.out.println("Move is done at : "+move);
        System.out.println(Arrays.toString(board));
    }

    private static int NitherWinningNorBlockingMove(int[] board) {
        int maxMove=0;
        int max = 0;
        for(int i=0;i<9;i++)
        {
            int point = PointDistribution(i);
            if(point>max)
            {
                max=point;
                maxMove=i;
            }
        }
        board[maxMove] = 0;
        System.out.println("Score = "+max);
        return maxMove;
    }

    private static int BlockingMove(int[] board) {

        for(int i=0;i<board.length;i++)
        {
            if(board[i]==2) {
                board[i] = 1;

                if (checkWinner(0, board) == 1) {
                    board[i] = 0;
                    System.out.println("Score = 50 (Blocking) ");
                    return i;
                } else {

                        board[i] = 2;

                }
            }
        }

        return 0;
    }

    private static int Winningmove(int[] board) {
        for(int i=0;i<board.length;i++)
        {
            if(board[i]==2) {
                board[i] = 0;

                if (checkWinner(0, board) == 0) {
                    System.out.println("Score = 60 (Win) ");
                    return i;
                } else {
                    board[i] = 2;
                }
            }
        }
        return 0;
    }




    //    Neither Winning nor blocking
    static int PointDistribution(int pos)
    {
//        corners
        if(pos==0 || pos== 2 || pos==6 || pos==8)
        {
            return 3;
        }else if(pos==1 || pos==3 || pos==5 || pos==7)
        {
            return 2;
        }else{
            return 4;
        }
    }

//





    private static int checkMoves(int[] board) {
        int X = 0;
        int O = 0;
        for(int i : board)
        {
            if(i==1)
            {
                X++;
            }else if(i==0)
            {
                O++;
            }
        }
        if(X>O)
        {
            return 0;
        }
        return 1;
    }

    private static int checkWinner(int winner,int board[]) {
        if(board[0]==board[1] && board[1] ==board[2] && board[1]==1 ||  board[3]==board[4] && board[4] ==board[5] && board[4]==1 || board[6]==board[7] && board[7] ==board[8] && board[7]==1 || board[0]==board[3] && board[3] ==board[6]  && board[3]==1|| board[1]==board[4] && board[4] ==board[7] && board[4]==1 || board[2]==board[5] && board[5] ==board[8] && board[5]==1)
        {
            winner=1;
            return winner;
        }else if(board[0]==board[1] && board[1] ==board[2] && board[1]==0 ||  board[3]==board[4] && board[4] ==board[5] && board[4]==0 || board[6]==board[7] && board[7] ==board[8] && board[7]==0 || board[0]==board[3] && board[3] ==board[6]  && board[3]==0|| board[1]==board[4] && board[4] ==board[7] && board[4]==0 || board[2]==board[5] && board[5] ==board[8] && board[5]==0)
        {
            winner=0;
            return winner;
        }
        else if(board[0]==board[4] && board[4] ==board[8] || board[2]==board[4] && board[4] ==board[6])
        {
            winner=board[4];
            return winner;
        }
        winner=2;
        return 2;
    }
}
