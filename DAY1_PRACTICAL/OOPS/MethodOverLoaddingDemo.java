package OOPS;
import java.lang.Object;
class Calculator
{
	public int add(int x,int y)
	{
		return x+y;
	}
	public float add(int x,float y)
	{
		return x+y; 
	}
	public double add(double x,double y)
	{
		return x+y; 
	}
}
public class MethodOverLoaddingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calculator cl=new Calculator();//object name is cl
System.out.println(cl.add(5,6));
System.out.println(cl.add(5,6.5));
System.out.println(cl.add(5.6,6.6));

	}

}
