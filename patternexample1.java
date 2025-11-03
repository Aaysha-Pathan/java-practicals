package javaa;

import java.util.Scanner;

public class patternexample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan =new Scanner(System.in);
		System.out.println("Enter number ");
		int num= Scan.nextInt();
		for(int i=0;i<=num;i++)
		{
			//column
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}


	}

