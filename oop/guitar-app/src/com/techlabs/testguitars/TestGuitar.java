package com.techlabs.testguitars;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.sun.javadoc.*;
import com.techlabs.guitars.Builder;
import com.techlabs.guitars.Guitar;
import com.techlabs.guitars.Inventory;
import com.techlabs.guitars.Wood;

public class TestGuitar {
	public static void main(String[] args) {
		Inventory ineventory = new Inventory();
		initializeInventary(ineventory);

		Guitar whatEnriksLike = new Guitar("abc12", Builder.FENDER, 1000, "stratocaster",
				com.techlabs.guitars.Type.ACOUSTIC, Wood.ALDER, Wood.ALDER);
		List matchguitar = (List) ineventory.search(whatEnriksLike);
		if (!matchguitar.isEmpty()) {
			System.out.println("enrikes you might have this guitar");
			for (Iterator iterartor = matchguitar.iterator(); iterartor.hasNext();) {
				Guitar guitar = (Guitar) iterartor.next();

				System.out.println("Enriks,you might like this " + guitar.getBuilder() + " " + guitar.getMode() + " "
						+ guitar.getType() + "guitar:\n " + guitar.getBackWood() + "back and sides,\n "
						+ guitar.getTopwood() + "top.\nYou can have it for only $ " + guitar.getPrice() + "! ");
			}
		} else
			System.out.println("Sorry, Enrikes, we have nothing for you");

	}

	private static void initializeInventary(Inventory inventory) {
		// TODO Auto-generated method stub
	
		inventory.addGuitar("abc1", Builder.GIBSON, 1000, "stratocaster", com.techlabs.guitars.Type.ACOUSTIC,
				Wood.ALDER, Wood.ALDER);
	}

}
