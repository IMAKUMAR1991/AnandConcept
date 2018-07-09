package Aingletona;
class Test{
	public static Test t= new Test();
	private Test(){
		System.out.println("i m in singleton");
	}
		public static   Test getText(){
			return t;
	}
}

     public class SingletonA {
     public static void main(String[] args) {
		Test t1= Test.getText();
		Test t2 = Test.getText();
	}
}
