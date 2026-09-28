package COLLECTION;
import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//ArrayList arr=new ArrayList();
		Vector arr=new Vector();
//Integer n=new Integer(10);
arr.add(10);
arr.add(25);
arr.add(15);
arr.add(60);
arr.add(40);
arr.add(50);
arr.add(15.5);
arr.add("SUMAN");
//arr.add(2,15);
//arr.remove(2);
//Collections.sort(arr);
System.out.println(arr);
System.out.println("TRAVESING THE DATA");
System.out.println("FOR EACH LOOP");
for(Object obj:arr)
{
	System.out.println(obj);
}
System.out.println("TRAVESRSE THE ELEMENTS USING ITERATOR ");
Iterator itr=arr.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}
System.out.println("BACKWARD DIRECTION PRINTING USING LISTITERATOR");
ListIterator ltr=arr.listIterator();
while(ltr.hasNext())
{
	ltr.next();
}
while(ltr.hasPrevious())
{
	System.out.println(ltr.previous());
}
	}

}
