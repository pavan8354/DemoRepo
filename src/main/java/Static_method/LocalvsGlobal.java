package Static_method;

public class LocalvsGlobal {
	
	String name="Pavan";
	int age= 25;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalvsGlobal obj = new LocalvsGlobal();
		System.out.println(obj.name);
		System.out.println(obj.age);
	}
	
	public void test() {
		
		System.out.println("Test case method");
		int a =10;
		int b = 20;
		int age = 25;
		
		
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
