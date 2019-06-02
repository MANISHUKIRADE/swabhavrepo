package com.techlabs.guitar;



import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
	private List guitars;

	public Inventory() {
		guitars = new LinkedList();
	}

	public void addGuitar(String serialnumber, Builder builder, double price, String mode, Type type, Wood topwood,
			Wood backwood) {
		Guitar guitar = new Guitar(serialnumber, builder, price, mode, type, topwood, backwood);
		guitars.add(guitar);

	}

	public Guitar getGuitar(String serialNo) {
		for (Iterator iterator = guitars.iterator(); iterator.hasNext();) {
			Guitar guitar = (Guitar) iterator.next();
			if (guitar.getSerialnumber().equals(serialNo))
				return guitar;
		}
		return null;
	}

	public List search(Guitar searchGuitar) {
		List matchguitar = new LinkedList();
		for (Iterator iterator = guitars.iterator(); iterator.hasNext();) {
			Guitar guitar = (Guitar) iterator.next();
			Builder builder = searchGuitar.getBuilder();
			if ((builder != null) && (!builder.equals("")) && (!builder.equals(guitar.getBuilder())))
				continue;
			String model = searchGuitar.getMode().toLowerCase();
			if ((model != null) && (!model.equals("")) && (!model.equals(guitar.getMode().toLowerCase())))
				continue;
			Type type = searchGuitar.getType();
			if ((type != null) && (!type.equals("")) && (!type.equals(guitar.getType())))
				continue;
			Wood backWood = searchGuitar.getBackWood();
			if ((backWood != null) && (!backWood.equals("")) && (!backWood.equals(guitar.getBackWood())))
				continue;
			Wood topWood = searchGuitar.getTopwood();
			if ((topWood != null) && (!topWood.equals("")) && (!topWood.equals(guitar.getTopwood())))
				continue;
			matchguitar.add(guitar);
		}
		return matchguitar;

	}
}