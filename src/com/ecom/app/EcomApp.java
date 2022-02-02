/**
 * 
 */
package com.ecom.app;

import java.util.Scanner;

import com.ecom.app.service.ProductService;
import com.ecom.app.service.ProductServiceImpl;
import com.ecom.app.utility.ScannerUtility;

/**
 * @author Suchita
 *
 */
public class EcomApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ProductService product = new ProductServiceImpl();
		while (true) {
			Scanner sc = ScannerUtility.getScanner();

			System.out.println("1]Add Product");
			System.out.println("2]Buy Product");
			System.out.println("3]Bill");
			System.out.println("4]Exit");

			System.out.println("Please Select the option");

			int option = sc.nextInt();

			switch (option) {
			case 1:
				product.addProduct();
				break;
			case 2:
				product.buyProduct();
				break;
			case 3:
				product.bill();
				break;
			case 4:
				System.out.println("Thank you!!!Welcome Again....");
				System.exit(0);
				break;
			default:
				System.exit(0);

				break;
			}

		}

	}

}
