package javaa;

import java.util.Scanner;

public class StrigBufferExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name; String surname;
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter Name");
		name=scan.next();
		System.out.println("Enter SurName");
		surname=scan.next();
		
		StringBuffer sb=new StringBuffer(name);
		sb.append(surname);
		
		System.out.print(sb);
		
		
	}

	
}
