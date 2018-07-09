package Javava;

class AnandKumar1 {
	private int montName;

	public void set(int montNUm) {
		if (montNUm >= 1 && montNUm <= 12) {
			this.montName = montNUm;
		} else {
			System.out.println("Invalid Month Number");
		}
	}

	public int get() {
		return montName;
	}
}

public class EncapsulationImportant {

	public static void main(String[] args) {

		AnandKumar1 t1 = new AnandKumar1();
		t1.set(23);
		System.out.println(t1.get());
		 t1.set(12);
		System.out.println(t1.get());

	}

}
