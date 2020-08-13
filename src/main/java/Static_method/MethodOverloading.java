package Static_method;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading obj = new MethodOverloading();
		obj.test();
		obj.test1(20);
		obj.test2(20, 30);
		
	}
	
	public static void main(int q) {
		// TODO Auto-generated method stub
		
			}
	public static void main(float q) {
		// TODO Auto-generated method stub
		
			}
	
	public void test() {
		System.out.println("Test case with------zero param");

	}
	
public  void test1(int i)   {		
		System.out.println("Test case with------first param");			
		System.out.println(i);
}
	
public void test2(int i ,int j) {
	
	System.out.println("Test case with------second param");
	System.out.print(j);
	
}

}
