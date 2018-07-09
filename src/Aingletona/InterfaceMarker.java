package Aingletona;

interface P{
	
}
class Q implements P{
	void show(){
		System.out.println("Hello, t1 is instance of P");
	}
}
public class InterfaceMarker {

	public static void main(String[] args) {
		Q t1= new Q();
		if(t1 instanceof P){
			t1.show();
		}
		else{
			System.out.println("ti in not instance of p");
		}
	
	}

}
