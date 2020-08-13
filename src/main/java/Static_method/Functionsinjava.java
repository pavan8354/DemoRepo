package Static_method;

public class Functionsinjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Functionsinjava obj = new Functionsinjava();
		int a = obj.test();
		System.out.println(a);
		String d = obj.test1();
		System.out.println(d);
		int c = obj.test3(10, 20);
		System.out.println(c);

	}
	
	public int test() {
		
		System.out.println("Test case method");
		int a =10;
		int b = 20;
		int c = a+b;
		return c;
		
	}
	
public  String test1()   {
		
		System.out.println("qpa method");
		String a ="Selenium";
		String b = "Engineer";
		String c = a+b;
		return c;
		
	}
	
public int test3(int x ,int y) {
	
	System.out.println("Test case division method");
	int z =x/y;
	
	return z;
	
}

}
