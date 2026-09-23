package OOPS;
final class Parents
{
	public final void display()
	{
		System.out.println("I AM IN PARENT CLASS");
	}
}
class Childs extends Parents
{
	public void display()
	{
		System.out.println("I AM IN CHILD CLASS");
	}
	
}
public class FinalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Childs ch=new Childs();
 ch.display();
	}

}
