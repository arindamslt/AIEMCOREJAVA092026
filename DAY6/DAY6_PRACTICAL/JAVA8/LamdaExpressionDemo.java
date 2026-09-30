package JAVA8;

public class LamdaExpressionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Inter1 i1=()->System.out.println("HELLO");
   i1.show();
   Inter2 i2=(a,b)->System.out.println(a+b);
   i2.add(5, 6);
   Inter3 i3=(a,b)->a*b;
   int res=i3.multiply(10, 20);
   System.out.println(res);
	}

}
