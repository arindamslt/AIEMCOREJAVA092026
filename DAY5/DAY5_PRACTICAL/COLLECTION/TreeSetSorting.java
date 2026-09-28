package COLLECTION;
import java.util.*;
public class TreeSetSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet<String> ts=new TreeSet<String>(new TestComparator());
ts.add("BHASKAR");
ts.add("SOUMYA");
ts.add("AJOY");
ts.add("JYOTI");
ts.add("AYAN");
ts.add("RUPAM");
ts.add("AJOY");
for(Object obj:ts)
{
	System.out.println(obj);
}
	}

}
