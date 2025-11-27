package javaa;
import java.util.ArrayList;
import java.util.Iterator;

class Bookk
{
	String title,auther;
	int price;
	Bookk(String title,String auther,int price)
	{
		this.title=title;
		this.auther=auther;
		this.price=price;
	}
	void display()
	{
		System.out.println(title+"\t"+auther+"\t"+price);
	}
	
}
public class LIstExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ArrayList<Bookk> lstBook=new ArrayList<Bookk>();
	lstBook.add(new Bookk("Focus","Robin Sharma",200));
	lstBook.add(new Bookk("Matters","Stephne",150));
	lstBook.add(new Bookk("Success","Shruti",500));
	lstBook.add(new Bookk("Leaning","Robin Sharma",250));
	
	
	
		Iterator<Bookk> i =lstBook.iterator();
		while(i.hasNext())
		{
			Bookk b=i.next();
			b.display();
		}
		
		
	
	}
	
	

}