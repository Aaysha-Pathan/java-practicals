package javaa;

import java.util.Scanner;

public class pattternexample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub{
		        Scanner obj = new Scanner(System.in);
		        System.out.print("Enter the number of rows: ");
		        int rows = obj.nextInt();
		
		        for (int i = 1; i <= rows; i++) {
		            for (int j = 1; j <= i; j++) {
		                System.out.print("* ");
		            }
		            System.out.println();
		        }
		        for (int i = rows - 1; i >= 1; i--) {
		            for (int j = 1; j <= i; j++) {
		                System.out.print("* ");
		            }
		            System.out.println();
		        }

	}

}
