package COLLECTION;

public class Student {
private String sname;
private String sdept;
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(String sname, String sdept) {
	super();
	this.sname = sname;
	this.sdept = sdept;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getSdept() {
	return sdept;
}
public void setSdept(String sdept) {
	this.sdept = sdept;
}
@Override
public String toString() {
	return "Student [sname=" + sname + ", sdept=" + sdept + "]";
}

}
