package week06;

public class GameBoard {

	String[][] board = new String[3][3];

	// create the game board with values.
	public void initialize() {
		int h = 0;
		int v = 0;
		int i = 1;
		if (i <= 3) {
			for (int x = 0; x < 3; x++) {
				board[h][v] = String.valueOf(i);
				i++;
				v++;
			}
		}
		h++;
		v = 0;
		if (i <= 6) {
			for (int x = 0; x < 3; x++) {
				board[h][v] = String.valueOf(i);
				i++;
				v++;
			}
		}
		h++;
		v = 0;
		if (i <= 9) {
			for (int x = 0; x < 3; x++) {
				board[h][v] = String.valueOf(i);
				i++;
				v++;
			}
		}
	}

	// Getting a valid entry for the game board.
	public boolean validEntry(int boardSpot, String input, Player player) {
		for (int h = 0; h<3; h++) {
			for (int v = 0; v<3; v++) {
				if (this.board[h][v].equals(String.valueOf(input)));
				this.board[h][v] = player.getxOrO();
				return true;
			}
			}
		return false;
			
		
	}
//		for (String[] space : board) {
//			for (String square : space) {
//				if (square.equals(input)) {
//					square = player.getxOrO();
//					return true;
//				}
//			}
//		}
//		return false;
//	}

// Display the game board.
	public void display() {
		System.out.println("\t+---+---+---+");
		System.out.println("\t| " + this.board[0][0] + " | " + this.board[0][1] + " | " + this.board[0][2] + " |");
		System.out.println("\t+---+---+---+");
		System.out.println("\t| " + this.board[1][0] + " | " + this.board[1][1] + " | " + this.board[1][2] + " |");
		System.out.println("\t+---+---+---+");
		System.out.println("\t| " + this.board[2][0] + " | " + this.board[2][1] + " | " + this.board[2][2] + " |");
		System.out.println("\t+---+---+---+\n");
	}

}
