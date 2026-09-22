package OOPS;
class Student
{
	public int rollno=1;
	public String sname="ALOKE";
	public void show()
	{
		System.out.println("ROLLNO:"+rollno);
		System.out.println("NAME:"+sname);
	}
}
class Exam extends Student
{
	public String sub1="PHYS";
	public String sub2="CHEM";
	public String sub3="MATH";
	public int marks1;
	public int marks2;
	public int marks3;
	public void display()
	{
		System.out.println("SUBJECT1:"+sub1);
		System.out.println("SUBJECT2:"+sub2);
		System.out.println("SUBJECT3:"+sub3);
	}
	public int score(int p,int c,int m)
	{
		
		return marks1+marks2+marks3;
	}
}
class Sem extends Exam
{
	public String sems="IVTH";
	public String yr="2ND";
	public void details()
	{
		System.out.println("SEMESTER:"+sems);
		System.out.println("YEAR:"+yr);
	}
}
public class MultiLevelInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Sem sm=new Sem();
 sm.show();
 sm.display();
 sm.details();
 int total=sm.score(80,90,95);
 System.out.println("TOTAL IS:"+total);
	}

}
