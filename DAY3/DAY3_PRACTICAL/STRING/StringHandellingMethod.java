package STRING;

public class StringHandellingMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String s="";
   System.out.println(s.isEmpty());
   String s1="abcdabcdabcdabcd";
   System.out.println(s1.replace('c','e'));
   String s2="BANGALORE";
   System.out.println(s2.substring(5,9));//9 means 9-1=8
   String s3="ALOKE";
   System.out.println(s3.charAt(2));
   String s4=" KOLKATA ";
   System.out.println(s4);
   System.out.println(s4.length());
   System.out.println(s4.trim());
   System.out.println(s4.trim().length());
   String s5="AJOY RAY";
   System.out.println(s5.indexOf('A'));
   System.out.println(s5.lastIndexOf('A'));
   String s6="welcome";
   System.out.println(s6.toUpperCase());
   System.out.println(s3.toLowerCase());
   String msg="HELLO,HOW ARE YOU,I AM FINE";
   String[] st=msg.split(",");
   for(String str:st)
   {
	   System.out.println(str);
   }

   
	}

}
