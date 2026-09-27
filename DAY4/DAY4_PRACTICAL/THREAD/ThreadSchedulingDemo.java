package THREAD;
class FtThread extends Thread
{
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			
			  System.out.println("THREAD1:"+i);
					
		}
	}
}
class StdThread extends Thread
{
	public void run()
	{
		for(int i=101;i<=200;i++)
		{
			  System.out.println("THREAD2:"+i);
							
		}
	}
}
public class ThreadSchedulingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 FtThread ft=new FtThread();
 StdThread sd=new StdThread();
 sd.setPriority(10);
 ft.setPriority(1);
 ft.start();
 sd.start();
	}

}
