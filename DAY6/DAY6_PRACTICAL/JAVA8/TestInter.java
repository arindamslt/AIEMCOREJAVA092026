package JAVA8;
class Testing implements Inter
{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("FUNCTIONAL INTERFACE IMPLEMENTATION");
	}
	
}
public class TestInter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Testing t=new Testing();
     t.display();
	}

}
