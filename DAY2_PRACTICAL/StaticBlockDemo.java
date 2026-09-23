package OOPS;
class TestStatic
{
	public static int x=0;
	public static int y=25;
	public static void display()
	{
		System.out.println("X:"+x);
		System.out.println("Y:"+y);
	}
	//STATIC BLOCK ACCESS ONLY STATIC MEBER.IT EXECUTES ONCE
	static
	{
		x=y*4;
	}
}
public class StaticBlockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   TestStatic.display();
	}

}
