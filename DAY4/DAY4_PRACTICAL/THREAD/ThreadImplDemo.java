package THREAD;
class FstThread implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
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
class SdThread implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
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
public class ThreadImplDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Thread th1=new Thread(new FstThread());
      Thread th2=new Thread(new SdThread()) ;
          th1.start();
      th2.start();
	}

}
