package Static_method;

public class staticvsnonstatic {

	String name = "tom"; // non static
	static int age = 25; //static
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		sum();
		staticvsnonstatic.sum(); 
		System.out.println(age);
		System.out.println(staticvsnonstatic.age);
		
		staticvsnonstatic obj = new staticvsnonstatic();
		obj.sendmail();
		System.out.println(obj.name);
	

	}
	
	public void sendmail() {  // NS M
		System.out.println("sendmail");
		
	}
public static void sum() {    //S M
	System.out.println("sum");
		
	}
	
}


