package projects;



//  1nd project
import java.util.Scanner;

public class TicTacToe {

    static char[][] board = {
        {' ', ' ' , ' '},
        {' ', ' ' , ' '},
        {' ', ' ' , ' '},
    };


    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in); // scanner class->  for taking input from user
            char player  = 'X';
            boolean gameOver = false;


            while(!gameOver){
               
                printBoard();
                System.out.println("Player"+ player + ", enter your move (row and column): ");

                 int row = sc.nextInt();
                 int col =  sc.nextInt();


                 // edge case
                 if(!isvalidMove(row, col)){
                        System.out.println("This move is not valid" );
                        continue;
                 }

               

                 // edge - case - cell is already occupied
                 if(board[row][col] == ' '){
                    board[row][col] = player;


                    if(checkWin(player)){
                        gameOver = true;
                        System.out.println(player + " wins!");
                    } else if(isDraw()){
                        gameOver = true;
                        System.out.println("Draw");
                    } else {
                        player = (player == 'X') ? 'O' : 'X';
                    }

                 } else {
                    System.out.println("This move is not valid");
                 }
                
            }

            sc.close();



         
    }

    static boolean isvalidMove(int row, int col){
        return  row >=0  && row < 3  && col >=0 && col < 3; 

    }


    static boolean checkWin(char player){
            for(int i = 0;  i< 3 ; i++){
                if(board[i][0] == player && board[i][1] == player && board[i][2] == player)
                    return true;
                if(board[0][i] == player && board[1][i] == player && board[2][i] == player)
                    return true;
            }

            return (board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
                    (board[0][2] == player && board[1][1] == player && board[2][0] == player);
    }

    static boolean isDraw(){
        for(int  i = 0; i< 3; i++){
            for(int j = 0;  j<3 ; j++){
                if(board[i][j] == ' ')
                    return false;
            }
        }

        return true;
    }


    static void printBoard(){
        System.out.println();
        System.out.println();
        for(int i = 0; i< 3; i++){ // i = 2
            System.out.println("        "+board[i][0] + " | "+ board[i][1] + " | " + board[i][2]);
            if(i < 2) System.out.println("        --+---+--");
        }

        System.out.println();
        System.out.println();


    }

    
}

