package OOPS;
class Product
{
	public String pid;
	public String pname;
	public int pqty;
	public double price;
	public String sdt;
	public Product(String pid,String pname,int pqty,double price,String sdt)
	{
		this.pid=pid;
		this.pname=pname;
		this.pqty=pqty;
		this.price=price;
		this.sdt=sdt;
	}
	public void salesOrder()
	{
		this.display();//INVOKING THE CURRENT OBJECT
		System.out.println("PID:"+this.pid);
		System.out.println("PNAME:"+this.pname);
		System.out.println("QUANTITY:"+this.pqty);
		System.out.println("PRICE:"+this.price);
		System.out.println("TOTAL PRICE:"+this.price*this.pqty);
		System.out.println("SALES DATE:"+this.sdt);
	}
	public void display()
	{
		System.out.println("SALES ORDER FROM XYZ LTD");
	}
}
public class ThisDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Product pd=new Product("P1", "TV",5, 25000.00, "23-09-2026");
pd.salesOrder();

	}

}
