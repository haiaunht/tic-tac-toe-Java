
package tictactoesimulation;

import java.util.Scanner;

/**
 *
 * @author Hai-Au Bui, Assignment 6
 */
public class TicTacToe {
    private  char [][] board;   //declare 2 dimension array, will set it to 4x4 at the no-argument constructor below
    private char whoseTurn; //whoseTurn will alternate 'X' or 'O' player's turn
    private  boolean status; //status is true when the game is come to an end, false when still playing
    private  char  winner; //if player 'X' won winner = 'X', if player 'O' won winner = 'O', if there is no winner winner = 'T'
    private int count = 0;
    
    
    /**
     * No-Argument constructor TicTacToe() will declare 4x4 2 dimension array
     * setting the board of still playing, so status = false
     * setting winner is no one, so winner = tie 'T'
     * setting player 'X' is the one play first
     */
    public TicTacToe(){ //no argument constructor
        board = new char[4][4];
        status = false;
        winner = 'T';
        whoseTurn = 'X';
        initialBoard();
    }
    
    /**
     * initialBoard() will set 16 elements of the board[][] to specific characters as shown as below
     * @param array[i][j] - set to specific character '1,2,3,4,5,6,7,8,9,a,b,c,d,e,f,g'
     */
    public void initialBoard(){
        board[0][0] = '1';
        board[0][1] = '2';
        board[0][2] = '3';
        board[0][3] = '4';
        board[1][0] = '5';
        board[1][1] = '6';
        board[1][2] = '7';
        board[1][3] = '8';
        board[2][0] = '9';
        board[2][1] = 'a';
        board[2][2] = 'b';
        board[2][3] = 'c';
        board[3][0] = 'd';
        board[3][1] = 'e';
        board[3][2] = 'f';
        board[3][3] = 'g';              
    }
    
    
    /**
     * Method printBoard() set the current board so player can track all the moves
     * whenever a player places their move, this printBoard() method updates board[i][j] elements
     */
    public void printBoard(){
        //System.out.println("Please choose your move as valid character below:");
        System.out.println("-----------------");
        for (int i=0; i<4; i++){
            System.out.print("| ");
            for(int j=0; j<4; j++){
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("----------------");
        }
            
    }
    
    /**
     * MutatorSystem.out.printf("Player %c, make your move: ",whoseTurn); input() method will collect player's input and
     * 1. convert number or letter to character by method next().charAt(0)(if player enter 11 or ab will trim only first character)
     * 2. Validate the move if this move already been placed on the board from previous moves
     * 3. Validate the move if it is character as declare or out of these character: '1,2,3,4,5,6,7,8,9,a,b,c,d,e,f,g'
     */
    public void input(){
        //create Scanner object to scan userInput
        Scanner userInput = new Scanner(System.in); 
        //prompt current player to input their move
        
        char move = userInput.next().charAt(0); 
        //create variable string valid and set to method check validate(move)
        String valid = validate(move);
        
        //while player not choosing a valid move, keep asking until valid move is placed
           while(valid != "valid move")
           {
                System.out.println("INVALID MOVE: "+ valid);
                move = userInput.next().charAt(0);
                valid = validate(move);
           }
                //user switch statement to assign these move to the array element of the currennt board 
                    switch(move){
                        case '1':                             
                            board[0][0] = whoseTurn;                
                            break;
                        case '2': 
                            board[0][1] = whoseTurn;                
                            break;
                        case '3':                
                            board[0][2] = whoseTurn;
                            break;
                        case '4':
                            board[0][3] = whoseTurn;
                            break;
                        case '5':
                            board[1][0] = whoseTurn;
                            break;
                        case '6':            
                            board[1][1] = whoseTurn;
                            break;
                        case '7':
                            board[1][2] = whoseTurn;
                            break;
                        case '8':
                            board[1][3] = whoseTurn;
                            break;
                        case '9':
                            board[2][0] = whoseTurn;
                            break;
                        case 'a':
                            board[2][1] = whoseTurn;
                            break;
                        case 'b':
                            board[2][2] = whoseTurn;
                            break;
                        case 'c':
                            board[2][3] = whoseTurn;
                            break;
                        case 'd':
                            board[3][0] = whoseTurn;
                            break;
                        case 'e':
                            board[3][1] = whoseTurn;
                            break;
                        case 'f':
                            board[3][2] = whoseTurn;
                            break;
                        case 'g':
                            board[3][3] = whoseTurn;
                            break; 
                    }
                //after one move, the count will increment to know how many moves has been made by players   
                count++;
            
            //if the current player makes their move, this method will alternate and change to next player
            if(whoseTurn == 'X')
            {
                whoseTurn = 'O';                
            }else{
                whoseTurn = 'X';                
            }
        
         //after 16 rurns, 16 position already taken place and the game has no winner, return a Tie
         if(count == 16)
                {
                   System.out.println("WOW! This is a tie game!");
                    status = true;                    
                }
        
    }
   
    /**
     * validate() method will validate the player's move and check if this move is valid
     * @param move - character: '1,2,3,4,5,6,7,8,9,a,b,c,d,e,f,g'
     * @return - valid move, or this move is out of the range, or this move is already been placed
     */
    public String validate(char move)
    {
        //if player choose a move not in these character: '1,2,3,4,5,6,7,8,9,a,b,c,d,e,f,g', 
        //then input() method will validate(move) and prompt player again
        if((move != '1') && (move != '2') && (move != '3') && (move != '4')
            && (move != '5') && (move != '6') && (move != '7') && (move != '8') 
            && (move != '9') && (move != 'a') && (move != 'b') && (move != 'c') 
            && (move != 'd') && (move != 'e') && (move != 'f') && (move != 'g'))
            return "Enter characters as shown on the board: ";
        //if current player chooses a move which is already been placed
        //then input() method will validate(move) and prompt player again
        else if(move == '1' && ((board[0][0] =='O')||(board[0][0] =='X')))
            return "That move has been place. Choose your move again: ";
        else if(move == '2' && ((board[0][1] =='O')||(board[0][1] =='X')))
            return "That move has been place. Choose your move again: ";
        else if(move == '3' && ((board[0][2] =='O')||(board[0][2] =='X')))
            return "That move has been place. Choose your move again: ";
        else if(move == '4' && ((board[0][3] =='O')||(board[0][3] =='X')))
            return "That move has been place. Choose your move again: ";
        else if(move == '5' && ((board[1][0] =='O')||(board[1][0] =='X')))
            return "That move has been place. Choose your move again: ";
        else if(move == '6' && ((board[1][1] =='O')||(board[1][1] =='X')))
            return "That move has been place. Choose your move again: ";
        else if(move == '7' && ((board[1][2] =='O')||(board[1][2] =='X')))
            return "That move has been place. Choose your move again: ";
        else if(move == '8' && ((board[1][3] =='O')||(board[1][3] =='X')))
            return "That move has been place. Choose your move again: ";
        else if(move == '9' && ((board[2][0] =='O')||(board[2][0] =='X')))
            return "That move has been place. Choose your move again: ";
        else if(move == 'a' && ((board[2][1] =='O')||(board[2][1] =='X')))
            return "That move has been place. Choose your move again: ";
        else if(move == 'b' && ((board[2][2] =='O')||(board[2][2] =='X')))
            return "That move has been place. Choose your move again: ";
        else if(move == 'c' && ((board[2][3] =='O')||(board[2][3] =='X')))
            return "That move has been place. Choose your move again: ";
        else if(move == 'd' && ((board[3][0] =='O')||(board[3][0] =='X')))
            return "That move has been place. Choose your move again: ";
        else if(move == 'e' && ((board[3][1] =='O')||(board[3][1] =='X')))
            return "That move has been place. Choose your move again: ";
        else if(move == 'f' && ((board[3][2] =='O')||(board[3][2] =='X')))
            return "That move has been place. Choose your move again: ";
        else if(move == 'g' && ((board[3][3] =='O')||(board[3][3] =='X')))
            return "That move has been place. Choose your move again: ";
        //if player move is good, input() will assign the move to the current board
        else
            return "valid move";
    }
   
    /**
     * simulateInput(char player, char letter) method will hard code the player's turn and their moves
     * to debug and problem in analyzeBoard() method and two accessors method done() and whoWon()
     * @param player - player 'X' turn or player 'O' turn
     * @param letter - the move the current player make and will be placed on the print board
     */
    public void simulateInput(char player, char letter){
        //assigne player 'x' or 'O' to whoseTurn
        whoseTurn = player; 
        String valid_letter = validate(letter);
        System.out.printf("Player %c, make your move: %c\n",whoseTurn,letter); 
        //validate the move "letter" that player input        
        if(valid_letter != "valid move")
           {
                System.out.println("INVALID MOVE: " + valid_letter);               
           }
            //switch statement will assign player's move to specific element of the current board
            switch(letter){
                case '1':
                    board[0][0] = whoseTurn;                
                    break;
                case '2':
                    board[0][1] = whoseTurn;
                    break;
                case '3':                
                    board[0][2] = whoseTurn;
                    break;
                case '4':
                    board[0][3] = whoseTurn;
                    break;
                case '5':
                    board[1][0] = whoseTurn;
                    break;
                case '6':            
                    board[1][1] = whoseTurn;
                    break;
                case '7':
                    board[1][2] = whoseTurn;
                    break;
                case '8':
                    board[1][3] = whoseTurn;
                    break;
                case '9':
                    board[2][0] = whoseTurn;
                    break;
                case 'a':
                    board[2][1] = whoseTurn;
                    break;
                case 'b':
                    board[2][2] = whoseTurn;
                    break;
                case 'c':
                    board[2][3] = whoseTurn;
                    break;
                case 'd':
                    board[3][0] = whoseTurn;
                    break;
                case 'e':
                    board[3][1] = whoseTurn;
                    break;
                case 'f':
                    board[3][2] = whoseTurn;
                    break;
                case 'g':
                    board[3][3] = whoseTurn;
                    break;
                    //because the invalid move will be solving in validate(move) method so this switch statement does not need
                    //"default"                    
            }
            //counter count keep track how many moves has been placed
            count++;
            
            //if the current player makes their move, this method will alternate and change to next player
            if(whoseTurn == 'X')
            {
                whoseTurn = 'O';
            }else{
                whoseTurn = 'X';
            }
           
            //after 16 rurns, 16 position already taken place and the game has no winner, return a Tie
            if(count == 16)
                {
                   System.out.println("WOW! THIS IS A TIE GAME!");
                    status = true;                    
                }
    }
    
    /**
     * 
     */
    public void analyzeBoard(){
           
        //checking winning on the rows
        for (int i=0; i<4; i++)
        {
            if( board[i][0] == board[i][1] && board[i][1] == board[i][2] )
            {
                winner = board[i][0];
                status = true;
            }
            else if (board[i][1] == board[i][2] && board[i][2] == board[i][3])
            {
                winner = board[i][1];
                status = true;
            }
        }
        
        //checking winning on the columns
        for (int j=0; j<4; j++)
        {
            if( board[0][j]== board[1][j] && board[1][j] == board[2][j])
            {
                winner = board[0][j];
                status = true;
            }
            else if (board[1][j]== board[2][j] && board[2][j] == board[3][j])
            {
                winner = board[1][j];
                status = true;
            }
        }
        
        //checking for cross-winning -        
        if(board[0][0] == board[1][1] && board[1][1]==board[2][2])  //check from row 1 -cross-winning case 1 for winning
        {
            winner = board[0][0];
            status = true;
        }
        else if( board[0][1]==board[1][2] && board[1][2]==board[2][3]) //check from row 1 -cross-winning case 2 for winning
        {
            winner = board[0][1];
            status = true;
        }
        else if( board[0][2]==board[1][1] && board[1][1] == board[2][0]) //check from row 1 - cross-winning case 3 of winning
        {
            winner = board[0][2];
            status = true;
        }
        else if(board[0][3]==board[1][2] && board[1][2]==board[2][1])  //check from row 1- cross-winning case 4 of winning
        {
            winner = board[0][3];
            status = true;
        }
        else if( board[1][0]==board[2][1] && board[2][1] == board[3][2]) //check from row 2- cross-winning case 1 of winning
        {
            winner = board[1][0];
            status = true;
        }
        else if(board[1][1]==board[2][2] && board[2][2]==board[3][3])   //check from row 2 - cross-winning case 2 of winning
        {
            winner = board[1][1];
            status = true;
        }
        else if( board[1][2]==board[2][1] && board[2][1] == board[3][0]) //check from row 2- cross-winning case 3 of winning
        {
            winner = board[1][2];
            status = true;
        }
        else if(board[1][3]==board[2][2] && board[2][2]==board[3][1])   //check from row 2- cross-winning case 4 of winning
        {
            winner = board[1][3];
            status = true;
        }
        
        
              
    }
    
    /**
     * done() method return true if the board is full, return false if players are still playing
     * @return - true if the game ended, false if still playing
     */
    public boolean done(){  //method return true if the game came to the end       
        
        return status;
    }
    
    /**
     * whoWon() method return the winner player 'X' or player 'O' of the game, or return T (tie)
     * if player X has 3 'X' first (in a row, or in a column or in the cross-win), return 'X'
     * if player O has 3 'O' first (in a row, or in a column or in the cross-win), return 'X'
     * if the board is full and neither player 'X' or player 'O' are winning, return 'T'
     * @return - 'X', 'O', or 'T'
     */
    public char whoWon(){
        return winner;
    }
    
    
}
