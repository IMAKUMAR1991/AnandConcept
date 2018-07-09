package Javava;

interface Abc{
	 int Anand(int k);
	 int kumar(int k);
	
}
  class B22 implements Abc{

	
	public int Anand(int k) {
		System.out.println("i m Anand int");
		return k+5;
	}

	public int kumar(int k){
		
		System.out.println("i m in kumar k");
		return k+32;
		
	}

	

	public int Anand() {
		// TODO Auto-generated method stub
	return 0;
	}
   public int kumar() {
		// TODO Auto-generated method stub
	return 0;
	}
	  
	
}

    public class Interf {
	public static void main(String[] args) {
		B22 b1 = new B22();
		b1.Anand(34);
		b1.Anand();
		b1.kumar();
		Abc a1 = new B22();
		a1.Anand(12);
		a1.kumar(23);
		System.out.println(b1.getClass().getName());
		System.out.println(a1.getClass().getName());
		
//		a1.kumar(); its in upcasting so need to implement or overRide interface method, same method name n argument required

//		a1.Anand();
		

	}

}
