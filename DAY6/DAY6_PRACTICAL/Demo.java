package OOPS;
class Employee
{
	public String eid="E1";
	public String ename="AJOY";
	public String dept="HR";
	public String toString()
	{
		return eid+"==>"+ename+"===>"+dept;
	}
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee emp=new Employee();
System.out.println(emp);
	}

}
