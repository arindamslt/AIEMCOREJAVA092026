package COLLECTION;
import java.util.*;
public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  TreeSet<Integer> ts=new TreeSet<Integer>();
  TreeSet<String> ts1=new TreeSet<String>();
  ts.add(10);
  ts.add(5);
  ts.add(15);
  ts.add(20);
  ts.add(30);
  ts.add(20);
  ts.add(40);
  ts1.add("BHASKAR");
  ts1.add("SOUMYA");
  ts1.add("AJOY");
  ts1.add("JYOTI");
  ts1.add("AYAN");
  ts1.add("RUPAM");
  ts1.add("AJOY");
  for(Object obj:ts)
  {
	  System.out.println(obj);
  }
  for(Object obj1:ts1)
  {
	  System.out.println(obj1);
  }
	}

}
