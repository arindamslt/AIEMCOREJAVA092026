package OOPS;
abstract class Shape
{
 public abstract void area(double r);
}
 class Circle extends Shape
{ 
	 //METHOD OVERRIDDING
	public void area(double r)
	{ 
		System.out.println(Math.PI*r*r);
	}
}
 class Square extends Shape
 { 
	 //METHOD OVERRIDDING
	 public void area(double r)
	 { 
		 System.out.println(r*r);
	 }
	 
 }
public class AbstractionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Circle  cr=new Circle();
  Square sq=new Square();
 // Shape sp=new Shape();//this is not possible
  cr.area(5.5);
  sq.area(5.5);
	}

}
