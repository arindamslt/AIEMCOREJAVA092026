package COLLECTION;
import java.util.*;
public class LinkListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String> ls=new LinkedList<String>();
ls.add("ROBIN");
ls.add("ANNANYA");
ls.add("ALOKE");
ls.add("JAYANTA");
ls.add("RUBY");
ls.add("ALOKE");
ls.add(2, "RAJAT");
ls.remove(2);
ls.addFirst("NAVIN");
ls.addLast("NAYAN");
for(Object ob:ls)
{
	System.out.println(ob);
}
	}

}
