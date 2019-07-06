package com.techlabs.board.player.game;

import com.techlabs.board.Board;
import com.techlabs.board.player.Computer;
import com.techlabs.board.player.Human;
import com.techlabs.board.player.Player;

public class HumanVsComp implements Game {
	private Player player1;
	private Player player2;
	private Board board;
	public HumanVsComp(Human player1,Computer player2,Board board) {
		this.player1=player1;
		this.player2=player2;
		this.board=board;
		
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public void playGame(Player payer1, Player palyer2, Board board) {
		// TODO Auto-generated method stub
		
	}

}
