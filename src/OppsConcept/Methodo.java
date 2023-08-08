package OppsConcept;

public class Methodo {

public void add() { //General Method
	System.out.println("this is no-arg method");
}
public void add(int x) {//parameterized method
	System.out.println("this is int-arg method");
}
public void add(String s) {
	System.out.println("this is String-arg method");
}
	public static void main(String[] args) {

Methodo obj=new Methodo();//Object
obj.add();//called method
obj.add(100);//
obj.add("a");//auto.promotion is applied here
//obj.add(10.10)// error Double we have not deCleared
	}

}
