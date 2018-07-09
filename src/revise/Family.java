package revise;
class FamilyForm{
	String name;
	String job;
	int age;
	String occ;

public FamilyForm(String name ,String job, int age)
{
	this.name=name;
	this.age=age;
	this.job=job;
	
}
public FamilyForm(String name ,String job, int age, String occ){
	this(name,job,age);
	this.occ=occ;
	
}
public void display(){
	System.out.println("************************");
	System.out.println(name);
	System.out.println(age);
	System.out.println(occ);
	System.out.println(job);
	System.out.println("************************");
	
}
}

public class Family {

	public static void main(String[] args) {
		FamilyForm r1= new FamilyForm("A","K",20);
		FamilyForm r2= new FamilyForm("A","K",30,"L");
		r1.display();
		r2.display();

	}

}
