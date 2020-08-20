package List_concept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> A1 = new ArrayList<Employee>();
		
		Employee e1 = new Employee("Pavan",27,"QA");
		Employee e2 = new Employee("cavan",24,"QAC");
		Employee e3 = new Employee("Davan",28,"SQA");
	

	ArrayList<Employee> ar4 = new ArrayList<Employee>();
	ar4.add(e1);
	ar4.add(e2);
	ar4.add(e3);
	
	Iterator<Employee>it = A1.iterator();
	while(it.hasNext())
	{
		Employee emp = it.next();
		System.out.println(emp.name);
		System.out.println(emp.age);
		System.out.println(emp.dept);
	}
	
	System.out.println("***********ADD ALL**************");
	
	ArrayList<String> ar5 = new ArrayList<String>();
	ar5.add("Dev");
	ar5.add("Ram");
	ar5.add("Dinesh");
	
	ArrayList<String> ar6 = new ArrayList<String>();
	ar5.add("Deves");
	ar5.add("Rames");
	ar5.add("Dinesha");
	
	ar5.addAll(ar6);
	
	for(int i=0;i<ar5.size();i++) {
		
		System.out.println(ar5.get(i));
	}
	
	System.out.println("***********REMOVE ALL**************");
	
ar5.removeAll(ar6);
	
	for(int i=0;i<ar5.size();i++) {
		
		System.out.println(ar5.get(i));
	}
	System.out.println("***********RETAIN ALL**************");
	
	ArrayList<String> ar7 = new ArrayList<String>();
	ar7.add("Ramesh");
	ar7.add("Rajesh");
	ar7.add("Dinesh");
	
	ArrayList<String> ar8 = new ArrayList<String>();
	ar8.add("Dinesh");
	ar8.add("Ramesh");
	ar8.add("Varun");
	
	ar7.retainAll(ar8);
	
	for(int i=0;i<ar7.size();i++) {
		
		System.out.println(ar7.get(i));
	}
}
}