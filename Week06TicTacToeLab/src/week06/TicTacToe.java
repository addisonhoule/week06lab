package week06;

import java.util.Scanner;

public class TicTacToe {
	static String winner = "";
	static Player player1 = new Player();
	static Player player2 = new Player();
	static Player active = new Player();

	//Error Checking
	private static boolean inputCheck(String input) {
		String [] validInput = {"1", "2", "3", "4", "5", "6", "7", "8", "9,"};
		for (String number : validInput) {
			if(input.equals(number)) {
				return true;
			} 
		}
		return false;
	}
	
	public static void main(String[] args) {

		System.out.println("----------------------------");
		System.out.println(" It's time for Tic Tac Toe! ");
		System.out.println("Enter Player Names to Begin.");
		System.out.println("----------------------------");

		Scanner sc = new Scanner(System.in);

		// Enter player names to generate board.

		System.out.print("Player 1: ");
		player1.setPlayer(sc.next());
		player1.setxOrO(player1, "X");
		System.out.print("Player 2: ");
		player2.setPlayer(sc.next());
		player2.setxOrO(player2, "O");

		System.out.println("\n");
		player1.describe();
		System.out.print(" goes first! You are " + player1.getxOrO() + "!\n");

		GameBoard newGame = new GameBoard();
		newGame.initialize();
		newGame.display();
		int squareNumber;
		int totalSquares = 1;
		active = player1;
		

//		Game Loop 
		while (winner.equals("") && totalSquares <=9) {
			System.out.println(active.getPlayer() + ", select a square: ");
			String input = sc.nextLine();
			if (inputCheck(input)) {
				squareNumber = Integer.valueOf(input);
				if (squareNumber > 0 && squareNumber <=9) {
					if (newGame.validEntry(squareNumber, input, active)) {
						if (active.equals(player1)) {
							active = player2;
						} else {
							active = player1;
						}
						totalSquares++;
						newGame.display();
					} else {
						System.out.println("Square is already full.");
					}
				}
			} else {
				System.out.println("Invalid option.");
			}
			
		}
		
		
//		Choosing a spot and checking if it is valid.
		

		sc.close();
	}
}
