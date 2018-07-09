package Javava;
 class anandkumar{
	private int i=12;
	public void setI(int k){
		i=k;
		}
	public int getI(){
		return i;
		
	}
}

public class EncapsulationBasic {
	

	public static void main(String[] args) {

	anandkumar a1= new anandkumar();
	
	System.out.println(a1.getI());
	
	a1.setI(1234);
	System.out.println(a1.getI());

	}

}
