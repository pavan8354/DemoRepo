package Static_method;

public class callbyvalandcalbyref {
	int a;
	int b;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		callbyvalandcalbyref obj = new callbyvalandcalbyref();
		
		int p= 50;
		int q= 30;
		obj.testsum(p,q);
		obj.a= 20;
		obj.b = 50;	
		obj.swap(obj);
		
		System.out.println(obj.a);
		System.out.println(obj.b);

	}
	
	public int testsum(int e ,int f) {
		
		 e= 50;
		 f =60;
		int g = e+f;
		return g;	

	}
	
public  void swap(callbyvalandcalbyref t)   {
	
	int temp;
	temp = t.a;
	t.a = t.b;
	t.b = temp;

	}
}
