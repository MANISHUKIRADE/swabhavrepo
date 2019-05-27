package com.techlabs.lineitem;

import java.util.Comparator;

public class SortByQuantity implements Comparator<LineItem> {

	@Override
	public int compare(LineItem o1, LineItem o2) {
		if(o1.quantity==o2.quantity)
		return 0;
		else if(o1.quantity>o2.quantity)
			return 1;
		else 
			return -1;
	}

}
