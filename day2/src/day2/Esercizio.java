package day2;

public class Esercizio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product("tastiera", 15);
		Product p2 = new Product("mouse", 15);
		
		System.out.println(p1.equals(p2));
		
		Product p3 = new Product("iphone", 1000);
		Product p4 = new Product("ipad", 1200);
		
		System.out.println(p3.equals(p4));
	}

}
