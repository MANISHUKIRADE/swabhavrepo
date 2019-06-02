package com.techlabs.guitar;

public class Guitar {
	private String serialNumber;
	private double price;
	GuitarSpec guitarspec;

	Guitar(String serialnumber, Builder builder, double price, String mode, Type type, Wood topwood, Wood backwood) {
		this.serialNumber = serialnumber;
		this.price = price;
		GuitarSpec guitarspec = new GuitarSpec(builder, mode, type, topwood, backwood);

	}
	public String getSerialnumber() {
		return serialNumber;
	}

	public double getPrice() {
		return price;
	}
	
	public GuitarSpec getGuitarspec() {
		return guitarspec;
	}

}
