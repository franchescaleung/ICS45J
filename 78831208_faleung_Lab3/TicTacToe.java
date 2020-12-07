import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TicTacToe {
	
	// error check
	public int[][] board;
	public int currentPlayer;
	
	// default constructor
	public TicTacToe()
	{
		// default tic tac toe 
		board = new int[3][3];
		currentPlayer = 1;
	}
	
	// constructor specified in requirements
	public TicTacToe(int n)
	{
		board = new int[n][n];
		currentPlayer = 1;
	}
	
	// copy constructor
	public TicTacToe(TicTacToe t)
	{
		this.board = t.board;
		this.currentPlayer = t.currentPlayer;
	}
	
	
	
	public boolean makeMove(int x, int y)
	{
		// directions are not clear about what happens when player occupies the space
		// themselves so I made the method return false if it is occupied by anyone
		// because if player's own piece is there, the move wouldnt be valid anyways
	
		
		if (board[x][y] != currentPlayer) // if the space is empty

		{
			board[x][y] = currentPlayer; // set current player to the position
			// change player?
			if (currentPlayer == 1)
				currentPlayer = 2;
			else if (currentPlayer == 2)
				currentPlayer = 1;
			
			return true; // return true
		}
		
		else // if the position isn't empty, return false and no move is made
		{
			return false;
		}
				
	}
	
	public int turn()
	{
		return currentPlayer;
	}

	public int gameStatus()
	{
		boolean winnerFound;
		boolean finishedSearch;
		
		// search row winner first
		for (int i = 0; i < board.length; i++)
		{
			winnerFound = false;
			finishedSearch = false;
			int playerNumberRow = board[i][0];
			int j = 1;
			while (j < board[i].length && board[i][j] == playerNumberRow)
			{
				winnerFound = true;
				if (j + 1 == board.length)
					finishedSearch = true;
				j += 1;
			}
			if (finishedSearch == true && winnerFound == true)
				return playerNumberRow;
		}
		
		// search diagonal winner second
		

		winnerFound = true;
		finishedSearch = false;
		int playerNumberDiagonalLeft = board[0][0]; // left to right
		int m = 0;
		for (int l = 0; l < board.length; l++)
		{
			if (board[l][m] != playerNumberDiagonalLeft)
				winnerFound = false;
			m++;
		}
		finishedSearch = true;
		
		if (finishedSearch && winnerFound)
			return playerNumberDiagonalLeft;
		

		winnerFound = true;
		finishedSearch = false;
		int playerNumberDiagonalRight = board[0][board.length-1]; // right to left
		int p = board.length - 1;
		for (int l = 0; l < board.length; l++)
		{
			if (board[l][p] != playerNumberDiagonalRight)
				winnerFound = false;
			p--;
		}
		finishedSearch = true;
		
		if (finishedSearch && winnerFound)
			return playerNumberDiagonalRight;
		
		
		// search column winner third
		for (int k = 0; k < board.length; k++)
		{
			winnerFound = false;
			finishedSearch = false;
			int playerNumberColumn = board[0][k];

			int l = 1;
			while (l < board.length && board[l][k] == playerNumberColumn)
			{
				winnerFound = true;
				if (l + 1 == board.length)
					finishedSearch = true;
				l += 1;
			}
			if (finishedSearch == true && winnerFound == true)
				return playerNumberColumn;
		}

		return 0; // if no winner, return 0
	}
	
	
	// returns false if game is still in progress
	public boolean gameOver()
	{
		if (gameStatus() == 0) // if no winner, game is not over
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
	// print board
	public String toString()
	{
		String b = "";
		for (int i = 0; i < board.length; i++) // row
		{
			for (int j = 0; j < board.length; j++) // column
			{
				b += board[i][j];
			}
			b += "\n";
		}
		return b;
	}
	
	// overwrite current board
	void loadBoard(String fileName) //throws FileNotFoundException //throws FileNotFoundException //IOException
	{
		
		
		
		
		//String line = reader.readLine();
		int lineNum = 0;
		int colNum = 0;
		try
		{
			FileReader reader = new FileReader(fileName);
			Scanner input = new Scanner(reader);
			int count = 1;
			while (input.hasNext())
			{
				
				String next = input.next();

				for (int i = 0; i < next.length(); i++)
				{
					
					board[lineNum][i] = Integer.parseInt(Character.toString(next.charAt(i)));
					
				}
				lineNum += 1;
				
			}
			reader.close();
			input.close();
		}
		catch(Exception e)
		{
			System.out.print("Invalid Board");
			
		}


	}
	
	public void saveBoard(String fileName) //throws FileNotFoundException
	//IOException
	{
		try
		{
			PrintWriter output = new PrintWriter(fileName);
			
			for (int i = 0; i < board.length; i++)
			{
				String write = "";
				for (int j = 0; j < board[i].length; j++)
				{
					write += board[i][j];
					
				}
				output.println(write);
			}
			output.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
			
			
		}
	}
	
	public int checkPosition(int x, int y)
	{
		try
		{
			return board[x][y];
		}
		catch(Exception e)
		{
			return -1;
		}
	}
	
	
	
}
