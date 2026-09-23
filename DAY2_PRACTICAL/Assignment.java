package OOPS;
class Percel
{
	class Destination
	{
		public void desti(String loc)
		{
			System.out.println("LOCATION:"+loc);
		}
		
	}
	class Contents
	{
		public void weight(double w)
		{
			System.out.println("WEIGHT IS:"+w);
		}
	}
}
public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Percel pr=new Percel();
 Percel.Destination ds=pr.new Destination();
 Percel.Contents cn=pr.new Contents();
 ds.desti("KOLKATA");
 cn.weight(60.00);
		 
	}

}
