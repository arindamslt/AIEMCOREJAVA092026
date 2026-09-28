package COLLECTION;
import java.util.*;
public class UserDefinedCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1=new Product("P1","TV" ,5,25000.00);
		Product p2=new Product("P2","TAB" ,12,22000.00); 
		Product p3=new Product("P3","LAPTOP" ,25,45000.00);
		Product p4=new Product("P4","MOBILE" ,12,12000.00);
		Product p5=new Product("P5","REFRIGERATOR" ,7,27000.00);
		Product p6=new Product("P6","WASHINGMACHINE" ,20,28000.00);
		ArrayList<Product> arr=new ArrayList<Product>();
		arr.add(p1);
		arr.add(p2);
		arr.add(p3);
		arr.add(p4);
		arr.add(p5);
		arr.add(p6);
		for(Product ps:arr)
		{
			System.out.println(ps);
		}
	}

}
