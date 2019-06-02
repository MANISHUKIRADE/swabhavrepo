package com.techlabs.guitar;



public class GuitarSpec {
	private Builder builder;
	private String mode;
	private Type type;
	private Wood backwood;
	private Wood topwood;
	public GuitarSpec(Builder builder,String mode,Type type,Wood topwood, Wood backwood) {
		// TODO Auto-generated constructor stub
		this.builder=builder;
		this.mode=mode;
		this.type=type;
		this.topwood=topwood;
		this.backwood=backwood;
		
		
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
