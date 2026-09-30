package JAVA8;

public class Products {
private String pid;
private String pname;
private Integer pqty;
private Double price;
private String compnm;
public Products() {
	super();
	// TODO Auto-generated constructor stub
}
public Products(String pid, String pname, Integer pqty, Double price, String compnm) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.pqty = pqty;
	this.price = price;
	this.compnm = compnm;
}
public String getPid() {
	return pid;
}
public void setPid(String pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public Integer getPqty() {
	return pqty;
}
public void setPqty(Integer pqty) {
	this.pqty = pqty;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}
public String getCompnm() {
	return compnm;
}
public void setCompnm(String compnm) {
	this.compnm = compnm;
}
@Override
public String toString() {
	return "Products [pid=" + pid + ", pname=" + pname + ", pqty=" + pqty + ", price=" + price + ", compnm=" + compnm
			+ "]";
}

}
