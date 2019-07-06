package com.techlabs.board;

import java.util.List;

import com.techlabs.board.player.Player;

public class Board {
	private char[] board = new char[9];

	public Board(char board[]) {
		for(int i=0;i<9;i++) {
			board[i]=(char)0;
		}
		this.board = board;
		// TODO Auto-generated constructor stub

	}

	public void addMove(int position, char playerchar) {
		
	if(board[position-1]== (char)0) {
			board[position-1] = playerchar;
			int i=0;
				System.out.print(board[i]+" "+board[i+1]+" "+board[i+2]+"\n"+board[i+3]+" "+board[i+4]+" "+board[i+5]+"\n"+board[i+6]+" "+board[i+7]+" "+board[i+8]);
		}
		else throw (new AllReadyMarkPosition());

		} 
	
	
	

	public boolean descion(Player player) {
		boolean descionflag=false;
		for (int i = 0; i < 2; i++) {
			if ((board[i] == board[i + 3]) && (board[i + 3] == board[i + 6]) && (board[i + 6] == player.getPlayerchar())
					|| ((board[i] == board[i + 1]) && (board[i + 1] == board[i + 2]) && (board[i + 2] == player.getPlayerchar()))) {
				descionflag = true;
				break;

			}
		}
		if (descionflag == false) {
			if ((board[0] == board[4]) && (board[4] == board[8])&&(board[8]==player.getPlayerchar())) {
				descionflag = true;
			} else if ((board[2] == board[4]) && (board[4] == board[6]) && (board[6] == player.getPlayerchar())) {
				descionflag = true;
			}

		}
		return descionflag;

	}

}
