package com.training.iface;

import com.training.models.Products;

public interface DataAccess<T> {
	
	public boolean add(Products t, String date);
	public void findAllTopSelling(String category, int month);

}
