package com.training.models;

public class Garments extends Products {
	
	private String size;
	private String material;
	
	public Garments(int itemCode, String itemName, double unitPrice, int quantity, String size, String material) {
		super(itemCode, itemName, unitPrice, quantity);
		this.size = size;
		this.material = material;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	
	


}
