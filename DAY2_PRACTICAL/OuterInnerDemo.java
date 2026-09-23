package OOPS;
class Outer
{
	int x=25;
	class Inner
	{
		int y=60;
		public void add()
		{
			int z;
			 z=x+y;
			 System.out.println("RESULT:"+z);
		}
	}
}
public class OuterInnerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Outer out=new Outer();
  Outer.Inner in=out.new Inner();
  in.add();
	}

}
