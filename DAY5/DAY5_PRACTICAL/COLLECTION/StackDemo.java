package COLLECTION;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack<String> st=new Stack<String>();
st.add("ROBIN");
st.add("ANNANYA");
st.add("ALOKE");
st.add("JAYANTA");
st.add("RUBY");
st.add("ALOKE");
st.push("RAJA");
st.pop();
System.out.println("CHECK THE TOP MOST ITEM");
System.out.println(st.peek());
for(Object obj:st)
{
	System.out.println(obj);
}
	}

}
