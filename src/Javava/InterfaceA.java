package Javava;
interface Car {
	void start();
	void accelerate();
}

class Audi implements Car {
	public void start() {
		System.out.println("start audi");
	}

	public void accelerate() {
		System.out.println("accelerate audi");
	}
	}

	class Benz implements Car {
		public void start() {
			System.out.println("start Benz");
		}

		public void accelerate() {
			System.out.println("accelerate Benz");
		}
	}

class driver {
	public void drive(Audi a) {
		a.start();
		a.accelerate();
	}

	public void drive(Benz b) {
		b.start();
		b.accelerate();
	}
}
  class driver2{
	 public void drive(Car c){
		 c.start();
		 c.accelerate();
	 }
	
  }

public class InterfaceA {
	public static void main(String[] args) {
	
		driver d1 = new driver();
		d1.drive(new Audi());
		d1.drive(new Benz());
	
		
		driver2 d2= new driver2();
		d2.drive(new Audi());
		d2.drive(new Benz());
		
	}
}
