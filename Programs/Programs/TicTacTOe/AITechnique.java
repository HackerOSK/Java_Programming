package Programs.TicTacTOe;

import java.util.Scanner;

public class AITechnique {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String board = new String();
            System.out.println("Enter your board status : ");
            board = sc.next();
            System.out.println("You current board Status");
            displayBoard(board);
            StringBuilder movestatus=new StringBuilder();
            int player =  checkMove(board);
            if(player==1)
            {
                System.out.println("Human turn!");
            }else {
                System.out.println("Move \t\t Score");
                int max = 0;
                int bestMove = 0;
                for (int i = 0; i < 9; i++) {
                    char ch = board.charAt(i);
                    int move = i + 1;
                    if (ch == '_') {
                        int score = getScore(move,board);
                        System.out.println(move + " \t\t\t\t\t " + score);
                        if (score > max) {
                            max = score;
                            bestMove = move;
                        }
                    }
                }

                System.out.println("Best move : "+bestMove);
                if(max==60)
                {
                    System.out.println("Winning Move!");
                }else if(max==50){
                    System.out.println("Blocking Move!");
                }else{
                    System.out.println("Neither Winning Nor Blocking Move!");
                }

                StringBuilder str = new StringBuilder(board);
                str.replace(bestMove-1,bestMove,"O");
                System.out.println("Final board position : ");
                displayBoard(str.toString());
            }

        }

    private static int getScore(int move,String board) {
//        checking if the move is winning move
        if(Winning(move,board))
        {
            return 60;
        }else if(blocking(move,board))
        {
            return 50;
        }else{
            return PointDistribution(move-1);
        }
    }

    private static boolean blocking(int move,String board) {
        char str[] = board.toCharArray();
        str[move-1]='X';
        if(checkWinner(0,str)==1)
        {
            return true;
        }
        return false;
    }

    private static boolean Winning(int move,String board) {
            char str[] = board.toCharArray();
            str[move-1]='O';
            if(checkWinner(0,str)==0)
            {
                return true;
            }
            return false;
    }

    static int checkWinner(int winner,char board[]) {
        if(board[0]==board[1] && board[1] ==board[2] && board[1]=='X' ||  board[3]==board[4] && board[4] ==board[5] && board[4]=='X' || board[6]==board[7] && board[7] ==board[8] && board[7]=='X' || board[0]==board[3] && board[3] ==board[6]  && board[3]=='X'|| board[1]==board[4] && board[4] ==board[7] && board[4]=='X' || board[2]==board[5] && board[5] ==board[8] && board[5]=='X')
        {
            winner=1;
            return winner;
        }else if(board[0]==board[1] && board[1] ==board[2] && board[1]=='O'||  board[3]==board[4] && board[4] ==board[5] && board[4]=='O'|| board[6]==board[7] && board[7] ==board[8] && board[7]=='O'|| board[0]==board[3] && board[3] ==board[6]  && board[3]=='O'|| board[1]==board[4] && board[4] ==board[7] && board[4]=='O' || board[2]==board[5] && board[5] ==board[8] && board[5]=='O')
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

    private static int checkMove(String board) {
            int X = 0;
            int O = 0;
            for(char c : board.toCharArray()){
                if(c=='X')
                {
                    X++;
                }else if(c=='O')
                {
                    O++;
                }
            }
            if(X<=O)
            {
                return 1;
            }
        return 0;
    }

    public static void displayBoard(String board) {
        System.out.println("___________________");
        for (int i = 0; i < board.length(); i += 3) {
            System.out.printf("|  \t%c\t  |  \t%c\t  | \t%c\t  |\n", board.charAt(i), board.charAt(i + 1), board.charAt(i + 2));
            System.out.println("----------------------------");
        }


    }
    }

