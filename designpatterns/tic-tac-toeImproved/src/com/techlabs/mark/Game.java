package com.techlabs.mark;

public class Game {
	 private Player player1;
	 private Player player2;
	 private Board  board;
	 private BoardAnalyser anlyser;
	 
	
	public Game(Player player1, Player player2, Board board) {
	    
		this.player1=player1;
		this.player2=player2;
		this.board=board;
        this.anlyser= new BoardAnalyser(this.board);  		
	}
	
	public void move(Player player , int position) {
         if(position==1) {
        	 board.markPlayerSign(0, 0, player.getSign());
         }else if(position==2) {
        	 board.markPlayerSign(0, 1, player.getSign());
         }else if(position==3) {
        	 board.markPlayerSign(0, 2, player.getSign());
         }else if(position==4) {
        	 board.markPlayerSign(1, 0, player.getSign());
         }else if(position==5) {
        	 board.markPlayerSign(1, 2, player.getSign());
         }else if(position==6) {
        	 board.markPlayerSign(1, 3, player.getSign());
         }else if(position==7) {
        	 board.markPlayerSign(2, 0, player.getSign());
         }else if(position==8) {
        	 board.markPlayerSign(2, 1, player.getSign());
         }else if(position==9) {
        	 board.markPlayerSign(2, 2, player.getSign());
         }
         
         
		
	}
 
}
