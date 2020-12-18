package com.training.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;

import com.training.models.Products;

class Test {

	private static Products prod;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		prod = new Products(101, "Soft Drink", 20, 1);
	}

	@org.junit.jupiter.api.Test
	void testGetItemCode() {
		assertEquals(101, prod.getItemCode());
	}

	@org.junit.jupiter.api.Test
	void testGetItemName() {
		assertNotNull(prod.getItemName());
	}

	@org.junit.jupiter.api.Test
	void testGetUnitPrice() {
		assertEquals(20, prod.getUnitPrice());
	}

	@org.junit.jupiter.api.Test
	void testGetQuantity() {
		assertEquals(1, prod.getQuantity());
	}

	@org.junit.jupiter.api.Test
	void testGetAmuont() {
		assertEquals(20, prod.getAmuont());
	}

}
