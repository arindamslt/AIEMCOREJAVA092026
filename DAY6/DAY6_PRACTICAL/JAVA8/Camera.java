package JAVA8;

public interface Camera {
 default void turnOn()
 {
	 System.out.println("CAMERA IS STARTING");
 }
}
