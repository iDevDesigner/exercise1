package com.idd;

import java.math.BigDecimal;

public class Product {

	int id;
	String brand;
	String description;
	double price;

	public Product(int id, String brand, String description, double d) {
		super();
		this.id = id;
		this.brand = brand;
		this.description = description;
		this.price = d;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", brand=" + brand + ", description=" + description + ", price=" + price + "]";
	}

}
