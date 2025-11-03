package javaa;

import java.util.Scanner;

public class checkday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj= new Scanner(System.in);
		System.out.print("enter Number");
		int Day = obj.nextInt();
	
		if(Day==1)
			System.out.println("Monday");
		else if(Day==2)
			System.out.println("Tuesday");
		else if(Day==3)
			System.out.println("Wednesday");
		else if(Day==4)
			System.out.println("Thursday");
		else if(Day==5)
			System.out.println("Friday");
		else if(Day==6)
			System.out.println("Saturday");
		else 
			System.out.println("wrong number");
}

}
