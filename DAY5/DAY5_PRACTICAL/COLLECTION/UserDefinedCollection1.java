package COLLECTION;
import java.util.HashMap;
import java.util.Map;


public class UserDefinedCollection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Student sd1=new Student("AYAN", "CSE");
  Student sd2=new Student("ROBIN","CSE");
  Student sd3=new Student("ANNANYA", "ECE");
  Student sd4=new Student("RAMAN","ECE");
  HashMap<Integer,Student> hp=new HashMap<Integer, Student>();
  hp.put(1,sd1);
  hp.put(2,sd2);
  hp.put(3,sd3);
  hp.put(4,sd4);
  for(Map.Entry<Integer,Student> entry:hp.entrySet())
		  {
	        System.out.println(entry.getKey());
	        System.out.println(entry.getValue());
		  }
  
	}

}
