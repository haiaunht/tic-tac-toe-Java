
package tictactoesimulation;

/**
 *
 * @author Hai-Au Bui, Assignment 6
 */
public class TicTacToeSimulation {

    /**
     * @param args the command line arguments
     */
   

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("\tThis is test case #1:\n");
        try{
             //test case #1
            // insert winning diagonal combitation
            // no exceptions should appear here
            TicTacToe myGame = new TicTacToe();
            myGame.printBoard();
            myGame.simulateInput('X','5');
            myGame.analyzeBoard();
            myGame.printBoard();
            myGame.simulateInput('O','2');
            myGame.printBoard();
            myGame.analyzeBoard();
            myGame.simulateInput('X','a');
            myGame.analyzeBoard();
            myGame.printBoard();
            myGame.simulateInput('O','1');
            myGame.printBoard(); 
            myGame.analyzeBoard();
            myGame.simulateInput('X','f');
            myGame.analyzeBoard();
            myGame.printBoard();
            myGame.whoWon();
            //Player 'X' has 3 cross win (5,a,f) first, I expect the game is stop and print out player 'X' is winning here
            if(myGame.done())
                System.out.println("Passed test case #1, winner must be 'X'; winner "+ myGame.whoWon());
            else System.out.println("Test case #1 failed");
            
        }
        catch(IllegalArgumentException e)
        {
            System.out.print(e.getMessage());
        }
    
        
        System.out.println("\n\t------------------------------------------------------\t\n");
        //this is test case number #2
        //exception of invalid character (not shown as on the board) happen at line 61 $('X','v')
        //expecting print out of "INVALID MOVE. ENTER THE CHARACTER AS SHOWN ON THE BOARD" and prompt player again
        //check for row win 
        System.out.println("\tThis is test case #2:\n");
        try{
            TicTacToe myGame = new TicTacToe();
            myGame.printBoard();
            myGame.simulateInput('X','v');
            myGame.simulateInput('X','1');
            myGame.analyzeBoard();
            myGame.printBoard();
            myGame.simulateInput('O','2');
            myGame.printBoard();
            myGame.analyzeBoard();
            myGame.simulateInput('X','5');
            myGame.analyzeBoard();
            myGame.printBoard();
            myGame.simulateInput('O','3');
            myGame.printBoard(); 
            myGame.analyzeBoard();
            myGame.simulateInput('X','f');
            myGame.analyzeBoard();
            myGame.printBoard();
            myGame.simulateInput('O','4');
            myGame.analyzeBoard();
            myGame.printBoard();
            myGame.whoWon();
            //Player 'O' has 3 O in the row (2,3,4) first, I expect the game is stop and print out player 'O' is winning here
            if(myGame.done())
                System.out.println("Passed test case #2, winner must be 'O'; winner "+ myGame.whoWon());
            else System.out.println("Test case #2 failed");
            
                    
        }
        catch(IllegalArgumentException e)
        {
            System.out.print(e.getMessage());
        }
        
        System.out.println("\n\t------------------------------------------------------\t\n");
        //this is test case number #3
        //exception of the move which already taken place, happen at line 111 $('O','1');
        //expecting print out of "INVALID MOVE. THE MOVE HAS BEEN PLACED" and prompt player again
        //check for column win 
        System.out.println("\tThis is test case #3:\n");
        try{
            TicTacToe myGame = new TicTacToe();
            myGame.printBoard();
            myGame.simulateInput('X','1');
            myGame.analyzeBoard();
            myGame.printBoard();
            myGame.simulateInput('O','5');
            myGame.printBoard();
            myGame.analyzeBoard();
            myGame.simulateInput('X','2');
            myGame.analyzeBoard();
            myGame.printBoard();
            myGame.simulateInput('O','1');
            myGame.simulateInput('O','3');
            myGame.printBoard(); 
            myGame.analyzeBoard();
            myGame.simulateInput('X','6');
            myGame.analyzeBoard();
            myGame.printBoard();
            myGame.simulateInput('O','7');
            myGame.analyzeBoard();
            myGame.printBoard();
            myGame.simulateInput('X','a');
            myGame.analyzeBoard();
            myGame.printBoard();
            myGame.whoWon();
            //Player 'X' has 3 X in the column (1,6,a)) first, I expect the game is stop and print out player 'X' is winning here
            if(myGame.done())
                System.out.println("Passed test case #3, winner must be 'O'; winner "+ myGame.whoWon());
            else System.out.println("Test case #3 failed");
                    
        }
        catch(IllegalArgumentException e)
        {
            System.out.print(e.getMessage());
        }
        
        System.out.println("\n\t------------------------------------------------------\t\n");
        //this is test case number #4
        //no exception happen here
        //check for a tie game when 16 move already been place and there is no winner, I expect the game is stop 
		//and print out winner = "T"
        System.out.println("\tThis is test case #4:\n");
        try{
            TicTacToe myGame = new TicTacToe();
            myGame.printBoard();
            myGame.simulateInput('X','1');
            myGame.analyzeBoard();
            myGame.printBoard();
            myGame.simulateInput('O','2');
            myGame.printBoard();
            myGame.analyzeBoard();
            myGame.simulateInput('X','3');
            myGame.analyzeBoard();
            myGame.printBoard();
            myGame.simulateInput('O','5');            
            myGame.printBoard(); 
            myGame.analyzeBoard();
            myGame.simulateInput('X','6');
            myGame.analyzeBoard();
            myGame.printBoard();
            myGame.simulateInput('O','b');
            myGame.analyzeBoard();
            myGame.printBoard();
            myGame.simulateInput('X','8');
            myGame.analyzeBoard();
            myGame.printBoard();
            myGame.simulateInput('O','4');
            myGame.analyzeBoard();
            myGame.printBoard();
            myGame.simulateInput('X','a');
            myGame.analyzeBoard();
            myGame.printBoard();
            myGame.simulateInput('O','7');
            myGame.analyzeBoard();
            myGame.printBoard();
            myGame.simulateInput('X','c');
            myGame.analyzeBoard();
            myGame.printBoard();
            myGame.simulateInput('O','9');
            myGame.analyzeBoard();
            myGame.printBoard();
            myGame.simulateInput('X','d');
            myGame.analyzeBoard();
            myGame.printBoard();
            myGame.simulateInput('O','e');
            myGame.analyzeBoard();
            myGame.printBoard();
            myGame.simulateInput('X','f');
            myGame.analyzeBoard();
            myGame.printBoard();
            myGame.simulateInput('O','g');
            myGame.analyzeBoard();
            myGame.printBoard();
            myGame.whoWon();
            //After 2 player placed their moves 16 times and there is no winner, expecting print out the game is tie here
            if(myGame.done())
                System.out.println("Passed test case #4, there is no winner; winner "+ myGame.whoWon());
            else System.out.println("Test case #4 failed");
                    
        }
        catch(IllegalArgumentException e)
        {
            System.out.print(e.getMessage());
        }
    }
    
}

