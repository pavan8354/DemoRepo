package Static_method;

public class Testing_push {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Testing_push obj = new Testing_push(20, 30);
		obj.test();
		obj.test1(20);
		obj.test2(20, 30);
		int x =20;
		int y = 30;
		
	}
	
	public static void main(int q) {
		// TODO Auto-generated method stub
		
		System.out.println("hello----->" +q);
		
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


public Testing_push(int x, int y) {
	
	int z = x+y;
	System.out.println("Helloooooo" +(x+y));

}

}
