package Test_Package;

public class finallise_concept {
	
	public void finalize() {
		
		System.out.println("finalize method");
	
	}
	public static void main(String[] args) {
		
		finallise_concept f1 = new finallise_concept();
		finallise_concept f2 = new finallise_concept();
		
		f1 = null;
		f2 = null;
		
		
		
	}
	

	
	
	}

	

