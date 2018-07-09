package Javava;
class anand
{
	public static int anand3(int i){
		System.out.println(i);
		int k = i+5;
		return(k);
	}
	}

public class Overload {

	public static void main(String[] args) {
		int l=anand2(12); // return type must be store
		System.out.println(l);
		
		System.out.println(anand2(69861)); // need return type
		
	}

	public static int anand2(int i) {
		int j =i+10;
	
		return j;
	}
	}

