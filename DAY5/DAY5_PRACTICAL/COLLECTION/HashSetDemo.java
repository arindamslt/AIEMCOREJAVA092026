package COLLECTION;
import java.util.*;
public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//HashSet<String> hs=new HashSet<String>();//BASED ON HASHCODE
LinkedHashSet<String> hs=new LinkedHashSet<String>();//NO DUPLICATION AND INSERTED ORDER
hs.add("ROBIN");
hs.add("ANNANYA");
hs.add("ALOKE");
hs.add("JAYANTA");
hs.add("RUBY");
hs.add("ALOKE");
hs.add("ANNANYA");
for(Object obj:hs)
{
	System.out.println(obj);
}
	}

}
