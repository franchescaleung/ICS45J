
public class ConnectFour extends TicTacToe{

	private int boardSize;
	public ConnectFour()
	{
		super(6);
		boardSize = 6;// constructor makes 6 x 6 board
	}
	public ConnectFour(int n)
	{
		super(n);
		boardSize = n;
	}
	
	// copy constructor
	public ConnectFour(ConnectFour c)
	{
		super(c);
		this.boardSize = c.boardSize;
		
	}
	
	// overload makeMove and gamestatus
	
	public boolean makeMove(int column)
	{
	
		int row = boardSize-1;
		while (row != -1)
		{
			if (checkPosition(row, column) == 0)
			{
				board[row][column] = turn();
				if (turn() == 1)
					currentPlayer = 2;
				else if (turn() == 2)
					currentPlayer = 1;
				return true;
			}
				// then put in that and break
			row -= 1;
			
		}
		return false;
	}
	
	// four in a row
	public int gameStatus()
	{
		
		// search row winner first
		for (int i = 0; i < boardSize; i++)
		{
			for (int j = 0; j < boardSize; j++)
			{
				
				if (board[i][j] != 0) // if not empty, then check
				{
					// check if four in a row
					if( j + 3 < boardSize 
							&& board[i][j]== board[i][j+1]
							&& board[i][j] == board[i][j+2]
									&& board[i][j] == board[i][j+3])
						return board[i][j]; // returns winner
				
					if (i + 3 < boardSize)
					{
						// look at column winner
						if (board[i][j] == board[i+1][j] &&
							board[i][j] == board[i+2][j] &&
							board[i][j] == board[i+3][j])
							return board[i][j]; // returns winner
					
						if (j - 3 >= 0 && board[i][j] == board[i+1][j-1]
								&& board[i][j] == board[i+2][j-2]
								&& board[i][j] == board[i+3][j-3]) // left diagonal
							return board[i][j];
						
						// right diagonal
						if (j + 3 < boardSize && board[i][j] == board[i+1][j+1]
								&& board[i][j] == board[i+2][j+2]
								&& board[i][j] == board[i+3][j+3])
							return board[i][j];
							
					
					}
					
			
				}
			}
			
		}
		return 0;
	}
}
