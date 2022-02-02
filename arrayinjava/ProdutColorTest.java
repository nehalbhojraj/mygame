package arrayinjava;
    
public class ProdutColorTest {
	Product product =null;
	
	public void addProduct() {
	
		product=new Product();
	product.setBarcode(123654);
	product.setName("T-Shirt");
	product.setPrice(600d);
	
	
	
	
	Color color1=new Color();
	color1.setColor("Black");
	
	
	Color color2=new Color();
	color2.setColor("Blue");
	
	Color color3=new Color();
	color3.setColor("Green");
	
	Color[] colors =new Color[3];
	
	colors[0]=color1;
	colors[1]=color2;
	colors[2]=color3;
	
	product.setColors(colors);
      }


public void display() {
	
	if(product !=null) {
		System.out.println(product.getBarcode()+"\t"+ product.getName()+"\t"+ product.getPrice());
	     for (Color c:product.getColors()) {
	    	 System.out.println("\t"+c.getColor());
	    	 
	    	 
	     }
	
	
}else{
	System.out.println("Product not Found");
	
}



}

public static void main(String[] args) {
	
	ProdutColorTest p=new ProdutColorTest();
	p.addProduct();
	
	p.display();
	
	
}



}
		
		
		
	
	

