package Javava;
class C {
	public void run(int i){
		System.out.println("i m in run");
		
	}
	public void run(int i, int j){
		System.out.println("i m in run2");
	}
	
}
class D extends C{
	public void run(int i)
	{
		System.out.println("i m in wish");
	}
	
}

public class A {

public static void main(String[] rgs) {
		C d1 = new D();
		d1.run(5);
		d1.run(6);
		d1.run(2);
		d1.run(34, 67);

	}

}
