package javaa;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> lst=new ArrayList<Integer>();
		lst.add(12);
		lst.add(24);
		lst.add(36);
		lst.add(48);
		Iterator<Integer> i =lst.iterator();
		int sum=0;
		while(i.hasNext())
		{
			sum=sum+i.next();
		}
		System.out.println(sum);
		
		

	}

}
