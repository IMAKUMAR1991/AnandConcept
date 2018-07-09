package Collection12;

import java.awt.List;
import java.util.Collection;
import java.util.LinkedList;

public class Collections {

	public static void main(String[] args) {
		LinkedList  l = new LinkedList();
		l.add('a');
		l.add("durga");
		l.add(2);
		System.out.println(l.getFirst());
		System.out.println(l.isEmpty());
		System.out.println(l.size());
		System.out.println(l.get(2));
    	l.remove("a");
		System.out.println(l.getFirst());
		
		System.out.println(l);
		
	      l.add(67 );
	    System.out.println(l.indexOf('a'));  
	    System.out.println(l.lastIndexOf("durga"));
	
  {	
	}

	}

	

}
