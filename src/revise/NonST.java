package revise;

public class NonST {
	static int i = 50; int j=30;
	public void wish(){
		System.out.println("i m anand");
		fly();
	}
	public void fly(){
		System.out.println("can i fly ");
	}

	public static void main(String[] args) {
		NonST t1 = new NonST();
		System.out.println(i);
		System.out.println(t1.j);
		t1.wish();
		

	}

}
