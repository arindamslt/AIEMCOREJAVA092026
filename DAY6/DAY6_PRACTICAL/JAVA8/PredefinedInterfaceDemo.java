package JAVA8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredefinedInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Predicate<Integer> p=i->i%2==0;
   System.out.println(p.test(10));
   System.out.println(p.test(5));
   Function<String,Integer> fn=s->s.length();
   System.out.println(fn.apply("SAYAN"));
  Function<String,String> fn1=s->s.toUpperCase();
  System.out.println(fn1.apply("robin"));
  Consumer<String> cn=s->System.out.println(s.concat("CSE"));
  cn.accept("UJJAL");
  Supplier<LocalDate> sp=()->LocalDate.now();
  System.out.println(sp.get());
  Supplier<LocalDateTime> sp1=()->LocalDateTime.now();
  System.out.println(sp1.get());
	}

}
