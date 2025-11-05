package javaa;

import java.util.Scanner;

public class arrayexample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("ENTER NO. OF ELEMENTS YOU WANT: ");
		int total_num=obj.nextInt();
		int []num =new int[total_num];
		for(int i=0;i<num.length;i++)
			
		{
			System.out.print("Enter "+i+" element ");
			num[i]=obj.nextInt();
		}
		for(int i=0;i<num.length;i++)
		{
			System.out.println(num[i]);
		}
		

	}

}
