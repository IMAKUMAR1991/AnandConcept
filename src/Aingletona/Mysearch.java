package Aingletona;

interface A {
	public void wish();
}

interface B extends A {
	public void run();

	public void fly();
}

abstract class M implements B {
	public void wish() {
	}

	public void fly() {
	}
}

class N extends M {

	@Override
	public void run() {
	}
}

public class Mysearch {
	public static void main(String[] args) {
		A obj = new N();
		obj.wish();
		B t2 = new N();
		t2.run();
		t2.fly();

	}

}
