package STRING;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s1=new String("SPRING");
     s1.concat("HIBERNATE");
     System.out.println(s1);
     StringBuffer sb1=new StringBuffer("SPRING");
     sb1.append("HIBERNATE");
     System.out.println(sb1);
     StringBuilder sbt=new StringBuilder("SPRINGBOOT");
     sbt.append("MICROSERVICE");
     System.out.println(sbt);
	}

}
