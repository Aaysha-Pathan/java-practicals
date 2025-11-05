package javaa;

import java.util.Scanner;

public class Arrayexample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int []num=new int[3];
		for(int i=0;i<num.length;i++)
		{
			System.out.print("Enter element ");
			
			num[i]=scan.nextInt();
		}
		for(int i=0;i<num.length;i++)
		{
			System.out.println(num[i]);
		}
		
	}

}