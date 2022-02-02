/**
 * 
 */
package com.ecom.app.model;

public class Product {

	private int id;
	private String name;
	private Double price;
	private Colors color;
	
	public Colors getColor() {
		return color;
	}
	public void setColor(Colors color) {
		this.color = color;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return id+ " | " + name+" | " + price+" | " + color ;
	}
	
	
	
}
