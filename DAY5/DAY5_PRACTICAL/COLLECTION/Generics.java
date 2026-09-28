package COLLECTION;
import java.util.*;
public class Generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> arr=new ArrayList<String>();
arr.add("ALOKE");
arr.add("BHASKAR");
arr.add("SOUMYA");
arr.add("DIBENDU");
arr.add("AJOY");
arr.add("ROBIN");
arr.add("DIBENDU");
//arr.add(10);
for(Object o:arr)
{
	System.out.println(o);
}
	}

}
