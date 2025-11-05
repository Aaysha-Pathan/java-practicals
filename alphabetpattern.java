package javaa;

import java.util.Scanner;
public class alphabetpattern {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner obj = new Scanner(System.in);
	        System.out.print("Enter the maximum number of alphabets ");
	        int max = obj.nextInt();
	        System.out.print("Enter the starting number");
	        int start = obj.nextInt();
	        for (int i = start; i <= max; i++) {
	            for (char ch = 'a'; ch < 'a' + i; ch++) {
	                System.out.print(ch + " ");
	            }
	            System.out.println();
	        }
	        for (int i = max - 1; i >= start; i--) {
	            for (char ch = 'a'; ch < 'a' + i; ch++) {
	                System.out.print(ch + " ");
	            }
	            System.out.println();
	        }
	}

}
