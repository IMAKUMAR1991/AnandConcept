package Interface1;
interface Car{
	public void Start();
	public void stop();
}
class Audi implements Car{

	@Override
	public void Start() {
		System.out.println("Start Audi");
	}

	@Override
	public void stop() {
	System.out.println("Stop Audi");
	}
}
  class Benz implements Car{

	@Override
	public void Start() {
		System.out.println("Start Benz");
	}

	@Override
	public void stop() {
		System.out.println("Stop Audi");
}
	
}
class Driver{
	public void drive(Audi a){
		a.Start();
		a.stop();
	}
	public void drive(Benz B){
		B.Start();
		B.stop();
	}
	
}
class Driver2{
	public void drive(Car c){
		c.Start();
		c.stop();
		
	}
}


public class Interface {

	public static void main(String[] args) {
		Driver d1= new Driver();
        d1.drive(new Audi());
	    System.out.println("@@@@@@@@@@@@@@@@@@");
		d1.drive(new Benz());
		
		Driver2 d2= new Driver2();
		d2.drive(new Audi());
		d2.drive(new Benz());
}

}
