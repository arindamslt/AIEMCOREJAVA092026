package OOPS;
class Parent
{
	public int x=25;
}
class Child extends Parent
{
	public int y=60;
	public void add()
	{
		System.out.println(x+y);
	}
}
public class SingleInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Child ch=new Child();
ch.add();
	}

}
