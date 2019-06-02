package com.techlabs.dogdoor;

public class DogDoor {
	private boolean open;
	public DogDoor() {
		// TODO Auto-generated constructor stub
		open =false;
	}
	
	public void open() {
		open = true;
	}
	public void close() {
		open=false;
	}
	
	public boolean isopen() {
		return open;
		
	}

}
