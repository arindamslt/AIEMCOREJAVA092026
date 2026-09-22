package OOPS;
class Furniture
{
	private double length=100.00;//instance variable
	private double width=200.00;
	private double height=300.00;
	public void volume()
	{
		double vol;//local variable
		vol=length*width*height;
		System.out.println("VOLUME IS:"+vol);
	}
}
public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Furniture chair=new Furniture();//object creation
 chair.volume();
 
	}

}
