package THREAD;
class Account
{
	public double balance=15000.00;
	public synchronized void debit(double amount)
	{
		this.balance=this.balance-amount;
		System.out.println("AFTER DEBIT:"+this.balance);
	}
	public synchronized void credit(double amount)
	{
		this.balance=this.balance+amount;
		System.out.println("AFTER CREDIT:"+this.balance);
	}
}
class Customer1 extends Thread
{
	Account acc;//OBJECT REFERENCE
	public Customer1(Account acc)
	{
		this.acc=acc;
	}
	public void run()
	{
		acc.debit(9000.00);
	}
}
class Customer2 extends Thread
{
	Account acc;
	public Customer2(Account acc)
	{
		this.acc=acc;
	}
	public void run()
	{
		acc.debit(7000.00);
	}
}
class Customer3 extends Thread
{
	Account acc;
	public Customer3(Account acc)
	{
		this.acc=acc;
	}
	public void run()
	{
		acc.credit(5000.00);
	}
}
public class SynchronizationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Account ac=new Account();
      Customer1 cs1=new Customer1(ac);
      Customer2 cs2=new Customer2(ac);
      Customer3 cs3=new Customer3(ac);
      cs1.start();
      cs2.start();
      cs3.start();
	}

}
