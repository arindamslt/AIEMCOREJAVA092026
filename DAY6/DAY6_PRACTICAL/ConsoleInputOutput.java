package OOPS;

import java.util.Scanner;

public class ConsoleInputOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//in out err PRINT STREAM VARIABLE 
		Scanner sc=new Scanner(System.in);
       System.out.println("ENTER YOUR NAME");
       String nm=sc.next();
       System.out.println("ENTER YOUR AGE");
       int age=sc.nextInt();
       System.out.println("NAME IS:"+nm);
       System.out.println("AGE IS:"+age);
       System.out.println("ENTER THE SALARY");
       double sal=sc.nextDouble();
       System.out.println("SALARY:"+sal);
       
       
       
	}

}
