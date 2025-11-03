package javaa;

import java.util.Scanner;

public class checktrafficsignal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner abc= new Scanner(System.in);
		System.out.println("enter color");
		String color=abc.nextLine();
		if(color.equals("red")) 
			System.out.println("Stop");
		else if(color.equals("yellow")) 
			 System.out.println("Wait");
		else if (color.equals("green"))
		     System.out.println("GO");
		else 
			 System.out.println("Wrong Color");
			
	}

}
