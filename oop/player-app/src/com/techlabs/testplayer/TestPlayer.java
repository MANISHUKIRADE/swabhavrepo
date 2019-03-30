package com.techlabs.testplayer;

import com.techlabs.player.*;

public class TestPlayer {
	public static void main(String[] args) {
		Player palyer1 = new Player("Sachin", 50);
		Player player2 = new Player("Virat");
		System.out.println("name=" + palyer1.getName());
		System.out.println("age=" + palyer1.getAge());
		System.out.println("age=" + player2.getAge());
		System.out.println("name" + player2.getName());
		Player p = palyer1.whoIsElder(player2);
		System.out.println("name" + p.getName());
		System.out.println("age" + p.getAge());

	}

}
