package COLLECTION;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  HashMap<String,Double> hp=new HashMap<String, Double>();//BASED ON HASHCODE ALOGORITHM
  //LinkedHashMap<String,Double> hp=new LinkedHashMap<String, Double>();
	//TreeMap<String,Double> hp=new TreeMap<String, Double>();
	HashMap<Integer,Product> hps=new HashMap<Integer, Product>();
	hps.put(1,new Product("P1","TV",5, 25000.00));
		hp.put("TV", 25000.00);
  hp.put("TAB",22000.00);
  hp.put("CONVECTION",22000.00);
  hp.put("MOBILE",15000.00);
  hp.put("LAPTOP",45000.00);
  hp.put("TV", 32000.00);
  System.out.println(hp);
 
   /*Set set=hp.entrySet();
   for(Object s:set)
   {
	   System.out.println(s);
   }*/
  for(Map.Entry<String, Double> entry:hp.entrySet())
  {
	   System.out.println(entry);
  }
  /*Set set=hps.entrySet();
  Iterator itr=set.iterator();
  while(itr.hasNext())
  {
	  Map.Entry me=(Map.Entry)itr.next();
	  System.out.println(me.getKey());
	  System.out.println(me.getValue());
  }*/
  for(Map.Entry<Integer,Product> entry:hps.entrySet())
  {
	  System.out.println(entry.getKey());
	  System.out.println(entry.getValue());
  }
	  
  
	}

}
