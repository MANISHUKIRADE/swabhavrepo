package com.techlabs.guitars;

public class Guitar {
	private String serialnumber;
	private double price;
	private Builder builder;
	private String mode;
	private Type type;
	private Wood backwood;
	private Wood topwood;

	public Guitar(String serialnumber, Builder builder, double price, String mode, Type type, Wood topwood,
			Wood backwood) {
		this.serialnumber = serialnumber;
		this.price = price;
		this.builder = builder;
		this.mode = mode;
		this.type = type;
		this.topwood = topwood;
		this.backwood = backwood;
		// TODO Auto-generated constructor stub

	}

	public String getSerialnumber() {
		return serialnumber;
	}

	public double getPrice() {
		return price;
	}

	public Builder getBuilder() {
		return builder;

	}

	public String getMode() {
		return mode;
	}

	public Type getType() {
		return type;
	}

	public Wood getTopwood() {
		return topwood;
	}

	public Wood getBackWood() {
		return backwood;
	}

}
