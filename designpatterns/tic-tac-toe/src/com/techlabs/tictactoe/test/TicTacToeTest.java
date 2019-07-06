package com.techlabs.tictactoe.test;

import com.techlabs.board.Board;
import com.techlabs.board.player.Human;
import com.techlabs.board.player.Player;
import com.techlabs.board.player.game.Game;
import com.techlabs.board.player.game.HumanVsHuman;

public class TicTacToeTest {
	public static void main(String[] args) {
		char board [] = new char[9];
		Board boardd = new Board(board);
		Player player1 = new Human('x');
		Player player2 = new Human('o');
		Game game = new HumanVsHuman(player1, player2, boardd);
	
		game.playGame();
	}

}
