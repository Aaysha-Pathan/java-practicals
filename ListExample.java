package javaa;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class ListExample {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList lst1=new ArrayList();
		lst1.add(12);
		lst1.add(23.4f);
		lst1.add(234234l);
		lst1.add(567.23);
		lst1.add("Aaysha");
		lst1.add(new Date());
		System.out.println(lst1);
		
		
		
		LinkedList lst2=new LinkedList();
		lst2.add(12);
		lst2.add(23.4f);
		lst2.add(234234l);
		lst2.add(23.4f);
		lst2.add(234234l);
		lst2.add(567.23);
		lst2.add("Aaysha");
		lst2.add(new Date());
		System.out.println(lst2+"\t"+lst2.get(3));
		
		
		Iterator i=lst2.iterator();
		while(i.hasNext())
		{
			Object o=i.next();
			System.out.println(o);
		}
		
		
		
		HashSet st=new HashSet(lst2);
		System.out.println(st);
	}
}