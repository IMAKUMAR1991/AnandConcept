package revise;
interface Cycle{
	void start();
	void stop();
}
class Hero implements Cycle{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("start hero");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("stop hero");
	}
	
}
class Atlas implements Cycle{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("start atlas");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("stop atlas");
	}
	
}
class Rider{
	public void ride(Hero h){
		h.start();
		h.stop();
		
	}
	public void ride(Atlas a){
		a.start();
		a.stop();
		
	}
}
class Rider2{
	public void ride(Cycle c){
		c.start();
		c.stop();
		
	}
}
public class Itra {

	public static void main(String[] args) {
		Rider r1= new Rider();
		r1.ride(new Hero());
		r1.ride(new Atlas());
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	   Rider2 r2= new Rider2();
	   r2.ride(new Hero());
	   r2.ride(new Atlas());
	}

}


	

