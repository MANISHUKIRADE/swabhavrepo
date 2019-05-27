package com.techlabs.lineitem;

import java.util.Comparator;

public class SortByPrice implements Comparator<LineItem> {

	@Override
public int compare(LineItem lineitem1, LineItem lineitem2) {
		
		// TODO Auto-generated method stub
	if(lineitem1.price==lineitem2.price)
		return 0;
	else if(lineitem1.price>lineitem2.price)
		return 1;
	else  
		return -1;
	}

}
