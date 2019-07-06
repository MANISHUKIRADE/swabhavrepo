package com.techlabs.mark;

public class Board {
	private Cell boardcells[][];
   
	public Board(BoardAnalyser anlyzer) {
		for(int index=0;index<3;index++) {
		 for(int row=0;row<3;row++) {
			 boardcells[row][index]=new Cell(new Mark(Sign.EMPTY));
		 }
		}
		
	   
		
	}
	
	public Cell[][] getBoardcells() {
		return boardcells;
	}
	public void markPlayerSign(int row ,int column , Sign sign) {
		boardcells[row][column].getMark().setSign(sign);
	}
	
}
