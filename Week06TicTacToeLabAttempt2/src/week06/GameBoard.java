package week06;

import java.util.Arrays;

public class GameBoard {

	String[] board = new String[9];

	// create a game board with values 1-9.
	public void initialize() {
		for (int i = 1; i <= 9; i++) {
			board[i - 1] = String.valueOf(i);
		}
	}

	public String winStatus() {
		for (int i = 0; i < 8; i++) {
			String win = null;
			switch (i) {
			case 0:
				win = this.board[0] + this.board[1] + this.board[2];
				break;
			case 1:
				win = this.board[3] + this.board[4] + this.board[5];
				break;
			case 2:
				win = this.board[6] + this.board[7] + this.board[8];
				break;
			case 3:
				win = this.board[0] + this.board[3] + this.board[6];
				break;
			case 4:
				win = this.board[1] + this.board[4] + this.board[7];
				break;
			case 5:
				win = this.board[2] + this.board[5] + this.board[8];
				break;
			case 6:
				win = this.board[0] + this.board[4] + this.board[8];
				break;
			case 7:
				win = this.board[2] + this.board[4] + this.board[6];
				break;
			}
			if (win.equals("XXX")) {
				return "X";
			} else if (win.equals("OOO")) {
				return "O";
			}

		}
		for (int i=1; i <=9; i++) {
			if(Arrays.asList(this.board).contains(String.valueOf(i))) {
				break;
			} else if (i==9) {
				return "draw";
			}
		}
		return "";

	}

	public boolean validEntry(int total, String input, Player player) {
		if (this.board[total - 1].equals(String.valueOf(input))) {
			this.board[total - 1] = player.getxOrO();
			return true;
		} else {
			return false;
		}
	}

	// Display the game board.
	public void display() {
		System.out.println("\t+---+---+---+");
		System.out.println("\t| " + this.board[0] + " | " + this.board[1] + " | " + this.board[2] + " |");
		System.out.println("\t+---+---+---+");
		System.out.println("\t| " + this.board[3] + " | " + this.board[4] + " | " + this.board[5] + " |");
		System.out.println("\t+---+---+---+");
		System.out.println("\t| " + this.board[6] + " | " + this.board[7] + " | " + this.board[8] + " |");
		System.out.println("\t+---+---+---+\n");
	}

}
