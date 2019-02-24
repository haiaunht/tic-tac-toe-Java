
package tictactoesimulation;

/**
 *
 * @author Hai-Au Bui, Assingment 6
 */
public class TicTacToeGame {
    public static void main(String[] args){
        //create TicTacToe object for player 'X' and player 'O' play their game
        TicTacToe myGame = new TicTacToe();
        myGame.printBoard();
        try
        {
            while (!myGame.done())
            {
                myGame.input();
                myGame.analyzeBoard();
                myGame.printBoard();                
            }
            System.out.println("Congratulations! The winner is: "+ myGame.whoWon());     
        }
        catch(IllegalArgumentException e)
        {
            System.out.print(e.getMessage());
        }
        
        
    }

}
