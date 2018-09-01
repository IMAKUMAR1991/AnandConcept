package Interface1;

interface A {
	public abstract void run();

	public abstract void wish();

	public abstract void fly();

}

interface B {
	void run();

	void ask();

}

interface D extends A, B {

}

abstract class E implements A, B {

}

public class Inter {

	public static void main(String[] args) {

	}

}
