package Static_method;

public class B_Object extends A_Object {

	public B_Object() {
//		super(10);
		super(20, 20);
		System.out.println("****************CHILD CLASS********************");
	}

	public B_Object(int i) {
		super(i);

//		System.out.println("****************CHILD CLASS********************");		
	}

	public B_Object(int i, int j) {
		super(i, j);

//			System.out.println("****************CHILD CLASS********************");		
	}

	public static void main(String[] args) {

		B_Object obj = new B_Object();
		B_Object obj1 = new B_Object(10);
		B_Object obj2 = new B_Object(10, 20);

	}
}
