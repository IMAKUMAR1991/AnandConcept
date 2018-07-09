package Javava;
interface important{
	 int Anand(int k);
	 int kumar(int k);
}
class AB implements important{

	
	public int Anand(int k) {
		System.out.println("i m Anand int");
		return k+5;
	}

	public int kumar(int k){
		
		System.out.println("i m in kumar k");
		return k+32;
		
	}
	
	}
	
public class InterFIMPORTANT {

	public static void main(String[] args) {
		 important a1= new AB();
		int s1= a1.Anand(1);
		 System.out.println(s1);

		
		// call kumar under println 
		 System.out.println(a1.kumar(2));
	//	 a1.Anand();  need integer as argument
		
		 AB a2= new AB();
		 a2.Anand(11);
		 System.out.println();
		 a2.kumar(22);
		 System.out.println();
	//	 a2.Anand()  need integer as argument

	}

}
