/**
 * 
 */
package com.ecom.app.model;

public class Colors {
  private int id;
  private String color;
  
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
@Override
public String toString() {
	return  id + " | "+ color;
}
  
	
	
}
