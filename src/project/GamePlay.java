package project;

import java.util.Scanner;

public class GamePlay {
	
	
	public static void displayGame() {
	int count = 0;
	boolean playing = true;
	boolean x = true;
	Scanner input = new Scanner(System.in);
	TicTacToe tictoe = new TicTacToe();
	
	tictoe.displayTemplate();
	do {
		if (x) {
			System.out.println("Player X Input a Number");
			tictoe.placePiece("X", input.nextInt());
			
			tictoe.displayMap();
			count++;
			x = !x;
			
		} else {
			System.out.println("Player O Input a Number");
			tictoe.placePiece("O", input.nextInt());
			
			tictoe.displayMap();
			
			x = !x;
			count++;
		}
		if(TicTacToe.Win() != null) {
			System.out.println((x ? "O" : "X") + "Winner");
			return;
		}
		else if(count == 9){
			System.out.println("Cat Wins");
			return;
		}
		
	}while(playing || count != 9);
	}
}
