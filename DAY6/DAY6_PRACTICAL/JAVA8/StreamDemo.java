package JAVA8;
import java.util.*;
import java.util.stream.Stream;
public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> arr=new ArrayList<Integer>();
arr.add(10);
arr.add(15);
arr.add(5);
arr.add(25);
arr.add(20);
arr.add(5);
arr.add(30);
/*for(Integer i:arr )
{
	System.out.println(i);
}*/
System.out.println("DISPLAY ALL DATA");
arr.stream().forEach(System.out::println);
//arr.stream().forEach(i->System.out.println(i));
System.out.println("PRINT THE EVEN DATA=======");
arr.stream().filter(i->i%2==0).forEach(System.out::println);
System.out.println("INCREASE EACH WITH 10");
arr.stream().map(i->i+10).forEach(System.out::println);
System.out.println("NATURAL SORTING========");
arr.stream().sorted().forEach(System.out::println);
System.out.println("PRINT IN DESCENDING ORDER=====");
arr.stream().sorted((i1,i2)->i2.compareTo(i1)).forEach(System.out::println);
System.out.println("DISTINCT VALUES===============");
arr.stream().distinct().forEach(System.out::println);
System.out.println("PRINT THE MAXIMUM VALUE========");
int max=arr.stream().max((i1,i2)->i1.compareTo(i2)).get();
System.out.println("MAX VALUE:"+max);
System.out.println("MINIMUM VALUE=============");
int min=arr.stream().min((i1,i2)->i1.compareTo(i2)).get();
System.out.println("MIN VALUE:"+min);
System.out.println("STORING MULTIPLE DATA=========");
Stream<Integer> s=Stream.of(10,100,1000,10000,100000);
s.forEach(System.out::println);
	}

}
