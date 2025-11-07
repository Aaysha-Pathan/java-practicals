package javaa;

import java.util.Scanner;

public class arrayoddevenexample {

	public static void main(String[] args) {
		        Scanner obj = new Scanner(System.in);
		        System.out.print("Enter the number of elements: ");
		        int n = obj.nextInt();
		        int[] number = new int[n];
		        for (int i = 0; i < n; i++) {
		            System.out.print("Enter element " + (i + 1) + ": ");
		            number[i] = obj.nextInt();
		        }
		        for (int i = 0; i < n; i++) {
		            if (number[i] % 2 == 0) {
		                System.out.println(number[i] + " is even");
		            } else {
		                System.out.println(number[i] + " is odd");
		            }
		        }
	}

}
