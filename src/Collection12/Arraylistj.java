package Collection12;

import java.util.ArrayList;

public class Arraylistj {

	public static void main(String[] args) {
	ArrayList a1= new ArrayList();
	a1.add("ram");
	a1.add(1,"sita");
	a1.add(23);
	a1.add('r');
	a1.add(1, "replace");
	Integer i = new Integer(24);
	a1.add(i);
	Integer m= (Integer) a1.get(5);
	System.out.println(" tfuyfouyf  "+m);
	
	System.out.println(a1);
	System.out.println(a1.get(1));
	String s = (String) a1.get(1); ///// required casting 
	System.out.println(s);
	int k=a1.indexOf("ram");
	System.out.println(i);
	for(int j=0; j<a1.size();j++){
		System.out.println(a1.get(j));
		
	}
	

	}

}
