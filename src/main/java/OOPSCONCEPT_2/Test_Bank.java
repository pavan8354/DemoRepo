package OOPSCONCEPT_2;

public class Test_Bank  {
	
	public static void main(String[] args) {
		
		HSBCBANK HS = new HSBCBANK();
		
		System.out.println(USBANK.min_bal);
		HS.carloan();
		HS.creditmethod();
		HS.debit();
		HS.educationloan();
		HS.Insurancefund();
		HS.mutualfund();
		
		
		USBANK US = new HSBCBANK();
		
		US.creditmethod();
		US.debit();
		US.transfermoney();
		
		
	}
	
}
	
