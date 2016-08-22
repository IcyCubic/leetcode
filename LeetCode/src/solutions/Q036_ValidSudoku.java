package solutions;

import java.util.HashSet;
import java.util.Set;

/*

Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.

The Sudoku board could be partially filled, where empty cells are filled with the character '.'.


A partially filled sudoku which is valid.

Note:
A valid Sudoku board (partially filled) is not necessa
*/
public class Q036_ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
    	Set<Character> valid = new HashSet<Character>();

    	//check rows
    	for (int i = 0; i < 9; i++){
    		valid.clear(); //clear between rows
    		for (int j = 0; j < 9; j++){
    			char current = board[i][j];
    			if (current != '.'){
    				if (valid.contains(current)) 
    					return false;
    				else 
    					valid.add(current);
    			}    			
    		}
    	}
    	//check cols
    	for (int j = 0; j < 9; j++){
    		valid.clear(); //clear between cols
    		for (int i = 0; i < 9; i++){
    			char current = board[i][j];
    			if (current != '.'){
    				if (valid.contains(current)) 
    					return false;
    				else 
    					valid.add(current);
    			}    	
    		}
    	}
    	//check blocks
    	for (int i = 0; i < 9; i += 3){    		
    		for (int j = 0; j < 9; j += 3){
    			valid.clear(); // clear between blocks
    			for (int k = 0; k < 3; k++){
    				for (int l = 0; l < 3; l++){
    					char current = board[i + k][j + l];
    	    			if (current != '.'){
    	    				if (valid.contains(current)) 
    	    					return false;
    	    				else 
    	    					valid.add(current);
    	    			}    	
	    			}
    			}    			    					
    		}
    	}
    	return true;
    }
    
    public static void main(String[] args){
    	Q036_ValidSudoku test = new Q036_ValidSudoku();
    	char[][] board = new char[][]{{'.','8','7','6','5','4','3','2','1'},
    								  {'2','.','.','.','.','.','.','.','.'},
    								  {'3','.','.','.','.','.','.','.','.'},
    								  {'4','.','.','.','.','.','.','.','.'},
    								  {'5','.','.','.','.','.','.','.','.'},
    								  {'6','.','.','.','.','.','.','.','.'},
    								  {'7','.','.','.','.','.','.','.','.'},
    								  {'8','.','.','.','.','.','.','.','.'},
    								  {'9','.','.','.','.','.','.','.','.'}}; 
    	System.out.println(test.isValidSudoku(board));
    }
}
