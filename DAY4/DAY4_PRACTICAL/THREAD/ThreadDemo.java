package THREAD;
class FirstThread extends Thread
{
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			try
			{
			  System.out.println("THREAD1:"+i);
			  Thread.sleep(100);
			}
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
		}
	}
}
class SecondThread extends Thread
{
	public void run()
	{
		for(int i=101;i<=200;i++)
		{
			try
			{
			  System.out.println("THREAD2:"+i);
			  Thread.sleep(100);
			}
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
			
		}
	}
}
public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FirstThread ft=new FirstThread();//READY STAGE
SecondThread sd=new SecondThread();//READY STAGE
ft.start();//running
sd.start();//running
//ft.run();
//sd.run();
for(int i=201;i<=300;i++)
{
	try
	{
	  System.out.println("MAIN:"+i);
	  Thread.sleep(100);
	}
	catch(InterruptedException ie)
	{
		ie.printStackTrace();
	}
	
}

	}

}
