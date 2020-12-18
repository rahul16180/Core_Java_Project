package com.training.models;

public class Products {
	//SUPER CLASS
	private int itemCode;
	private String itemName;
	private double unitPrice;
	private int quantity;
	private double amount;
	
	public Products() {
		super();
	}

	public Products(int itemCode, String itemName, double unitPrice, int quantity) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
		this.amount = quantity*unitPrice;
	}

	public int getItemCode() {
		return itemCode;
	}

	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getAmuont() {
		return amount;
	}

	public void setAmuont(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return itemName + "\t    " + 
				unitPrice + "\t " + 
				quantity + "\t    " + amount;
	}
	
	


}
