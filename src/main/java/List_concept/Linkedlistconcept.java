package List_concept;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlistconcept {
	
	public static void main(String[] args) {
		
		
		LinkedList<String> li = new LinkedList<String>();
	
		System.out.println("************ADD FIRST*******");
		li.add("text");
		li.add("QTP");
		li.add("Selenium");
		li.add("RPA");
		li.add("RFT");
		li.add("RWT");
		li.add("RPT");
		li.add("RAT");
		
		System.out.println("contents of linked list"+li);
		
		
		
		li.addFirst("Pavan");
		li.addLast("Gowda");
		System.out.println("************ADD LAST*******");
		System.out.println("contents of linked list"+li);	
		
		System.out.println("************GET ALL*******");
		System.out.println(li.get(0));
	
		System.out.println("************SET ALL*******");
		
		li.set(0, "PAVAN GOWDA");
		
		for(int i=0;i<li.size();i++) {
		
		System.out.println(li.get(i));
	
		System.out.println("************REMOVE ALL*******");	
		
		li.removeFirst();
		System.out.println(li);
		
		li.removeLast();
		System.out.println(li);
		
		li.remove(1);
		
		System.out.println(li);
		
		for(String str:li) {
			
			System.out.println("contents of linked list" +str);
		}
		
		System.out.println("************ITERATOR*******");
		Iterator<String>it = li.iterator();
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		
		System.out.println("************USING WHILE*******");
		int num=0;
		while(li.size()>num) {
			
			System.out.println(li.get(num));
			num++;
		}
		
	}
	
	}
	
}

	


