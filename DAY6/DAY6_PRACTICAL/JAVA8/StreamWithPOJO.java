package JAVA8;
import java.util.*;
public class StreamWithPOJO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Products> arr=new ArrayList<Products>();
Products p1=new Products("P1","TV",5,25000.00,"SAMSUNG");
Products p2=new Products("P2","TAB",7,22000.00,"HP");
Products p3=new Products("P3","LAPTOP",15,45000.00,"HP");
Products p4=new Products("P4","MOBILE",25,15000.00,"SAMSUNG");
Products p5=new Products("P5","CONVECTION",2,18000.00,"IFB");
Products p6=new Products("P6","REFRIGERATOR",22,25000.00,"WHIRLPHOOL");
arr.add(p1);
arr.add(p2);
arr.add(p3);
arr.add(p4);
arr.add(p5);
arr.add(p6);
System.out.println("DISPLAY ALL RECORDS ====");
arr.stream().forEach(System.out::println);
System.out.println("FIND OUT THOSE RECORDS WHOSE COMPANY NAME IS HP====");
arr.stream().filter(ps->ps.getCompnm().equals("HP")).forEach(System.out::println);
System.out.println("10% DISCOUNT OFFER TO ALL PRODUCTS==");
arr.stream().map(ps->ps.getPrice()-(ps.getPrice()*10/100)).forEach(System.out::println);
System.out.println("THOSE COMPANY NAME IS SAMSUNG THERE DISCOUNT 15%");
arr.stream().filter(ps->ps.getCompnm().equals("SAMSUNG")).map(ps->ps.getPrice()-(ps.getPrice()*15/100)).forEach(System.out::println);
System.out.println("PRINT DESCENDING ORDER BASED ON PRODUCT NAME=====");
arr.stream().sorted((ps1,ps2)->ps2.getPname().compareTo(ps1.getPname())).forEach(System.out::println);
System.out.println("FIND OUT MAXIMUM VALUE======");
double max=arr.stream().max((ps1,ps2)->ps1.getPrice().compareTo(ps2.getPrice())).get().getPrice();
System.out.println("MAXIMUM VALUE:"+max);
System.out.println("FIND OUT MINIMUM VALUE======");
double min=arr.stream().min((ps1,ps2)->ps1.getPrice().compareTo(ps2.getPrice())).get().getPrice();
System.out.println("MINIMUM VALUE:"+min);
System.out.println("PRINT PRODUCT NAME,QUANTITY,PRICE,TOTAL PRICE======== ");
	}

}
