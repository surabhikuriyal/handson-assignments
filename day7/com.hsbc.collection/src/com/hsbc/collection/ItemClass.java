package com.hsbc.collection;

public class ItemClass {
	private int itemId;
	private String name;
	private double price,ratings;
	
	
	
	public ItemClass(int itemId, String name, double price, double ratings) {
		super();
		this.itemId = itemId;
		this.name = name;
		this.price = price;
		this.ratings = ratings;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getRatings() {
		return ratings;
	}
	public void setRatings(double ratings) {
		this.ratings = ratings;
	}
	@Override
	public String toString() {
		return "ItemClass [itemId=" + itemId + ", name=" + name + ", price=" + price + ", ratings=" + ratings + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(ratings);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		ItemClass other = (ItemClass) obj;
		if (Double.doubleToLongBits(ratings) != Double.doubleToLongBits(other.ratings))
			return false;
		return true;
	}
	

}
