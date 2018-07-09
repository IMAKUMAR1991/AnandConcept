package revise;
class add{
	int a; int b; int c;
	int addN(int a, int b)
	{
		this.a=a;
		this.b=b;
	    c=a+b;
		return c=a+b;
	}
	void value(){
		System.out.println(c);
		
	}
	
}


public class MEthod {
	public static void main(String[] args) {
		add a1= new add();
		a1.addN(12, 12212);
		System.out.println(a1.c);
		a1.value();
		
	}

}
