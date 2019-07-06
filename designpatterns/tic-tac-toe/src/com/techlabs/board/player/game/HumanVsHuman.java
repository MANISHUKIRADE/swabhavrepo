package com.techlabs.board.player.game;

import java.util.Scanner;

import com.techlabs.board.Board;
import com.techlabs.board.player.Human;
import com.techlabs.board.player.Player;

public class HumanVsHuman implements Game {
	private Player player1;
	private Player player2;
	private Board board;

	public HumanVsHuman(Player player1, Player player2, Board board) {
		this.player1 = player1;
		this.player2 = player2;
		this.board=board;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void playGame() {
		int i=0;
		// TODO Auto-generated method stub
		while (i<2) {

			i=i++;
			System.out.println("player1 Move");
			
			board.addMove(player1.move(), player1.getPlayerchar());
			System.out.println("player2 Move");
			board.addMove(player2.move(), player2.getPlayerchar());
			if ((board.descion(player1) == true)) {
				System.out.println("player1 win");
				break;

			}
			if (board.descion(player2) == true) {
				System.out.println("player 2 win");
				break;
			}

		}

	}

}
