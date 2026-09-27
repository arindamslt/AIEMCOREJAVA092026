package THREAD;
class TestThread extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=100;i++)
			{
				System.out.println(this.currentThread().getName()+i);
			    Thread.sleep(100);
			}
		}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
	}
}
public class DaemonThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      TestThread tt=new TestThread();
      tt.setDaemon(true);
      tt.start();
      try
		{
			for(int i=101;i<=150;i++)
			{
				System.out.println("MAIN:"+i);
			    Thread.sleep(100);
			}
		}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
	}

}
