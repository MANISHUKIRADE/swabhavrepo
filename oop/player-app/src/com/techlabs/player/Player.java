package com.techlabs.player;

public class Player {
	private int age;
	private String name;

	public Player(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Player(String name) {
		this(name, 18);

	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;

	}

	public Player whoIsElder(Player player) {
		if (this.getAge() > player.getAge()) {

			return this;
		}

		else {
			return player;

		}

	}
}
