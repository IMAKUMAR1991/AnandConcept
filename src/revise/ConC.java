package revise;
class Ab{
	 Ab(){
		 this(4);
		System.out.println(" i m in conc");
		
	}
	 Ab(int i){
		 System.out.println(" i m in int conc ");
		 
	 }
	
}
class An extends Ab{
	An(){
		
	}
	
	
}

public class ConC {
public static void main(String[] args) {
		Ab t = new Ab();
		An t2= new An();
		
	
			
	

	}

}
