package COLLECTION;

import java.util.Comparator;

public class TestComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		//return o1.compareTo(o2);//ASCENDING ORDER
		//return o2.compareTo(o1);//DESCENDING ORDER
		//return -o1.compareTo(o2);//DESCENDING ORDER
		//return -o2.compareTo(o1);//ASCENDING ORDER
		//return 1;//INSERTED ORDER 
		//return 0;//ONLY PRINT ROOT ELEMENT
		return -1;//REVERSE OF INSERTED ORDER
	}

}
