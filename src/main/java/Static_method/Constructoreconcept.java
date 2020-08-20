package Static_method;

public class Constructoreconcept {
	
	public Constructoreconcept() {	
		System.out.println("Default constructor");
	}
	

public Constructoreconcept(int i) {
		
		System.out.println("single parameter constructor");
		System.out.println("The value of i is---------->"+i);
	}
public Constructoreconcept(int i,int j) {
	
	System.out.println("two param constructor");
	System.out.println("The value of i and j is------------->"+i);
	System.out.println("The value of i and j is------------->"+j);
}

	public static void main(String[] args) {
		
		Constructoreconcept obj = new Constructoreconcept();
		Constructoreconcept obj1 = new Constructoreconcept(10);
		Constructoreconcept obj2 = new Constructoreconcept(10,20);
}
}