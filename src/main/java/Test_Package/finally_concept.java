package Test_Package;

public class finally_concept {
	
	public static void main(String[] args) {
		
//		test1();
//		test2();
		division();
		
	}
	

	public static void test1() {
		
		try {
			System.out.println("********child class start**********");
		throw new RuntimeException("test") ;
			// TODO Auto-generated catch block
		} catch(Exception e) {
			
			System.out.println("inside catch block");
		}
		finally
		{
			System.out.println("inside finally block");
		}
		
		}
public static  void test2() {
		
		try {
			System.out.println("********surround test2**********");
					// TODO Auto-generated catch block
		} 	
		finally
		{
			System.out.println("inside finally block in test(2)");
		}
		
		}
public static  void division() {
	
	int i=10;
	try {
		System.out.println("********surround try block**********");
				// TODO Auto-generated catch block
		int k = i/0;
	} 	
	
	catch(NullPointerException e)
		{
		System.out.println("inside CATCH block in test(2)");
		System.out.println("Surrounded by catch block with zero error");
	}
	finally {
		
		System.out.println("Execute the code even after exception");
	}
	
	}

	}

