package com.techlabs.board.player;

import com.techlabs.board.Board;

public class Computer implements Player {

	private char compchar;
	
	public Computer(Human player1,Board board) {
		if(player1.getPlayerchar()=='x') {
			this.compchar='o';
		}
		else
			this.compchar='x';
			
	
		}
		// TODO Auto-generated constructor stub
	
	@Override
	public int move() {
		// TODO Auto-generated method stub
	return 0;
		
	}


	@Override
	public char getPlayerchar() {
		// TODO Auto-generated method stub
		return compchar;
	}

}
