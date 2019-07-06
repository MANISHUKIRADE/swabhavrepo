package com.techlabs.board.player;

import java.util.Scanner;

import com.techlabs.board.Board;

public class Human implements Player {

	private char playerchar;
	Scanner scanner = new Scanner(System.in );
	
	public Human(char playerchar) {
		this.playerchar=playerchar;
		
		// TODO Auto-generated constructor stub
	}
	@Override
	public int move() {
		// TODO Auto-generated method stub
		return scanner.nextInt();
		
	}
	
	public char getPlayerchar() {
		return playerchar;
	}

}
