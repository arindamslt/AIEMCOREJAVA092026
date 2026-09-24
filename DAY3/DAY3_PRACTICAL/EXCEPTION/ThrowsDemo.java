package EXCEPTION;
class Calc
{
	public int x=25;
	public int y=0;
	public void result() throws ArithmeticException,Exception
	{				
		int res;
		   res=x/y;//CALLE ENVIRONMENT
		  System.out.println("RESULT:"+res);
}
	
}
public class ThrowsDemo {

	public static void main(String[] args) throws ArithmeticException,Exception {
		// TODO Auto-generated method stub
   Calc c=new Calc();
   c.result();//CALLER ENVIRONMENT
	}

}
