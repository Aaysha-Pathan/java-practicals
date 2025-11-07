package javaa;

import java.util.Scanner;

public class squarerootexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scan = new Scanner(System.in);

		        System.out.print("Enter number of elements: ");
		        int n = scan.nextInt();

		        int[] arr = new int[n];

		        // Input array elements
		        for (int i = 0; i < n; i++) {
		            System.out.print("Element " + (i + 1) + ": ");
		            arr[i] = scan.nextInt();
		        }

		        System.out.println("\nOutput (element : square root):");
		        for (int i = 0; i < n; i++) {
		            double sqrt = Math.sqrt(arr[i]);
		            System.out.println(arr[i] + " : " + sqrt);
		      		    }
		

	}

}
