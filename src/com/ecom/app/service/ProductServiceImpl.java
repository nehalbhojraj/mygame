/**
 * 
 */
package com.ecom.app.service;

import java.util.Scanner;

import com.ecom.app.model.Colors;
import com.ecom.app.model.Product;
import com.ecom.app.utility.ScannerUtility;

/**
 * @author Suchita
 *
 */
public class ProductServiceImpl implements ProductService {

	private Product product=null;
	private Colors color=null;
	private int qty=0;
	
	@Override
	public void addProduct() {
		Scanner sc=ScannerUtility.getScanner();
        product =new Product();		
		color=new Colors();		
		System.out.println("Enter Prduct Id");
		product.setId(sc.nextInt());
		
		System.out.println("Enter Product Name");
		product.setName(sc.next());
		
		System.out.println("Enter Price of Product");
		product.setPrice(sc.nextDouble());
		
		System.out.println("Enter Color Id");
		color.setId(sc.nextInt());
		
		System.out.println("Enter Color");
		color.setColor(sc.next());
		
		product.setColor(color);
	}

	@Override
	public void buyProduct() {
	Scanner sc=ScannerUtility.getScanner();		
		display();
		if(product!=null) {
			System.out.println("please Select Produt Id ");
		System.out.println("Enter Quantity");
		 qty=sc.nextInt();
		}else {		
			System.out.println("Product Not Found");
		
		
		}
		
		
		
	}

	@Override
	public void bill() {
		// TODO Auto-generated method stub
		Double totalAmt=product.getPrice()*qty;
		System.out.println("Id | Name    |Price   |CId  |color     |qty |totalAmount");
		System.out.println(product+"|"+qty+ " | "+totalAmt);
		
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
if (product!=null)
	System.out.println(product);
	
else
	System.out.println("Produt Not Found");
	
	}

}
