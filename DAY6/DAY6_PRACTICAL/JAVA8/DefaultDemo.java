package JAVA8;
class SmartDevice implements Camera,Phone
{

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		//Camera.super.turnOn();
		Phone.super.turnOn();
	}
	
}
public class DefaultDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   SmartDevice sd=new SmartDevice();
   sd.turnOn();
	}

}
