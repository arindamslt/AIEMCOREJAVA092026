package STRING;

public class StringConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String s1=new String("AJOY");
  String s2=new String("AJOY");
  System.out.println(s1==s2);
  System.out.println(s1.equals(s2));
  StringBuffer sb1=new StringBuffer("JEE");
  StringBuffer sb2=new StringBuffer("JEE");
  System.out.println(sb1==sb2);
  System.out.println(sb1.equals(sb2));
	}

}
