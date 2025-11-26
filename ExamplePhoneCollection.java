package javaa;

import java.util.ArrayList;
import java.util.Iterator;

class phone{
	String brand,model,color;
	int price;
	phone (String brand, String model, int price, String color)
	{
		this.brand=brand;
		this.model=model;
		this.price=price;
		this.color=color;
	}
	void display()
	{
		System.out.println(brand + "\t" + model + "\t"+ price + "\t"+ color );
		
	}
}
public class ExamplePhoneCollection 
{
	public static void main(String args[])
	{
		ArrayList<phone> lstphone = new ArrayList<phone>();
		lstphone.add( new phone ("apple","iphone 14",80000,"lilac"));	
		lstphone.add( new phone ("oneplus","Oneplus12",70000,"green"));	
		lstphone.add( new phone ("vivo","V29",60000,"blue"));	
		lstphone.add( new phone ("samsung","Galaxy S24",50000,"black"));	
		Iterator<phone> i=lstphone.iterator();
		while(i.hasNext())
		{
			phone p=i.next();
			p.display();
			
		}
		
	}
}
