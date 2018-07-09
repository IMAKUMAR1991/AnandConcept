package Collection12;

import java.util.Collections;
import java.util.LinkedList;

class M{
	public void My(){
	LinkedList l = new LinkedList();
	l.add("Ram");
	l.add(1, "Shyam");
	l.add(1, "RemoveShyam"); // it takes postion of index no 2 n replace all by index+1
	l.addFirst("Anand");
	l.set(0, "RemoveAnand");// it remove index objet n take their place
	System.out.println(l);
	Collections.sort(l);
	System.out.println(l);
	}
}


public class LinlkedList {

	public static void main(String[] args) {
		M m = new M();
		m.My();
	

	}

}
