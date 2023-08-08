package OppsConcept;

public class BClass extends AClass {

public void B1() {
	System.out.println("This Belongs to B Class");
}
	public static void main(String[] args) {
	
BClass obj=new BClass();
obj.M1();
obj.B1();
	}

}
