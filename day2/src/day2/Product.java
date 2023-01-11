package day2;

public class Product {
	
	String name;
	double price;
	
	public Product(String name, double price) {
		
		this.name = name;
		this.price = price;
		
	}
	
	@Override
	public boolean equals(Object p) {
		
		Product _p = (Product)p;
		return this.price == _p.price;
		
	}
}
