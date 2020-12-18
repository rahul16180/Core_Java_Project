package com.training.models;

public class Electronics extends Products {

	private String size;
	private int warrenty;
	private double electricityWattage;
	
	public Electronics(int itemCode, String itemName, double unitPrice, int quantity, String size, int warrenty,
			double electricityWattage) {
		super(itemCode, itemName, unitPrice, quantity);
		this.size = size;
		this.warrenty = warrenty;
		this.electricityWattage = electricityWattage;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getWarrenty() {
		return warrenty;
	}

	public void setWarrenty(int warrenty) {
		this.warrenty = warrenty;
	}

	public double getElectricityWattage() {
		return electricityWattage;
	}

	public void setElectricityWattage(double electricityWattage) {
		this.electricityWattage = electricityWattage;
	}
	
	
}
