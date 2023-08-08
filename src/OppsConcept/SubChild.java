package OppsConcept;

public class SubChild extends Child{

public void cash() {
System.out.println("Cash 5000 Pounds");	
}
	public static void main(String[] args) {

SubChild obj=new SubChild();
obj.cash(); // SubChild Property
obj.rd();  // Child Property
obj.fd(); //  Parent Property

	}

}
