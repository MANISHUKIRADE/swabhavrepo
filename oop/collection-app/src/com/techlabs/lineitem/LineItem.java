package com.techlabs.lineitem;

import java.util.Comparator;

public class LineItem implements Comparable<LineItem> {
	private String product;
	public int price;
	public int quantity;
	
	public LineItem(String product,int price,int quantity ){

		this.product=product;
		this.price=price;
		this.quantity=quantity;
	}
	public double calculateTotalCost() {
		return price*quantity;
	}
	
	public String getProduct() {
		return product;
	}
	public int getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + price;
		result = prime * result + ((product == null) ? 0 : product.hashCode());
		result = prime * result + quantity;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LineItem other = (LineItem) obj;
		if (price != other.price)
			return false;
		if (product == null) {
			if (other.product != null)
				return false;
		} else if (!product.equals(other.product))
			return false;
		if (quantity != other.quantity)
			return false;
		return true;
	}
	

	@Override
	public int compareTo(LineItem item) {
		if(product.equals(item.product))// TODO Auto-generated method stub
		return 0;
		else 
			return 1;
	}
	
}