package THREAD;
class Stock
{
	public int qoh=50;
	public synchronized void issue(int req)
	{
		if(req>this.qoh)
		{
			try
			{
				this.wait();
			}
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
			
		}
		System.out.println("CURRENT STOCK:"+(this.qoh-req));
	}
	public synchronized void demand(int d)
	{
		this.qoh=this.qoh+d;
		System.out.println("AFTER PRODUCER DEPOSIT:"+this.qoh);
		this.notify();
	}
}
class Consumer extends Thread
{
	Stock st;
	public Consumer(Stock st)
	{
		this.st=st;
	}
	public void run()
	{
		st.issue(25);
	}
}
class Producer extends Thread
{
	Stock st;
	public Producer(Stock st)
	{
		this.st=st;
	}
	public void run()
	{
		st.demand(50);
	}
}
public class ConsumerProducerProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stock st=new Stock();
Consumer cs=new Consumer(st);
Producer pr=new Producer(st);
cs.start();
pr.start();
	}

}
