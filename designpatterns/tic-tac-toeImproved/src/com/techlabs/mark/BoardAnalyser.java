package com.techlabs.mark;

public class BoardAnalyser {
	private Board board;

	public BoardAnalyser(Board board) {

		this.board = board;
	}

	public boolean anlyszeBoard() {
		Cell[][] boardcell = board.getBoardcells();
		boolean winFlag = false;
		for(int index=0;index<3;index++) {
			if((boardcell[index][0].getMark().getSign()==boardcell[index][1].getMark().getSign())&&(boardcell[index][1].getMark().getSign()==boardcell[index][2].getMark().getSign())) {
				winFlag=true;
				break;
			}else if((boardcell[0][index].getMark().getSign()==boardcell[1][index].getMark().getSign())&&(boardcell[1][index].getMark().getSign()==boardcell[2][index].getMark().getSign())) {
				winFlag=true;
				break;
			}
		}
		if((boardcell[0][0].getMark().getSign()==boardcell[1][1].getMark().getSign())&&(boardcell[1][1].getMark().getSign()==boardcell[2][2].getMark().getSign())) {
			winFlag=true;
		}else if((boardcell[0][2].getMark().getSign()==boardcell[1][1].getMark().getSign())&&(boardcell[1][1].getMark().getSign()==boardcell[2][0].getMark().getSign())) {
			winFlag= true;
		}
		return winFlag;
	}
	
	

}
