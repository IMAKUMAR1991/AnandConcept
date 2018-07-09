package Javava;

public class WRapper {
	public static void main(String[] args) {
		Integer it = new Integer(78); // boxing
		System.out.println(it);

		int i = it.intValue();   // unboxing
		System.out.println(i);
		
		Integer its= 24;  // autoboxing
		System.out.println(its);
		
		int j= its;  // autounboxing
		System.out.println(j);
		
		String s1="55";
		int k = Integer.parseInt(s1);
		System.out.println(k);
		
		int l = Integer.parseInt("20");
		System.out.println(l);
		
		}
}
