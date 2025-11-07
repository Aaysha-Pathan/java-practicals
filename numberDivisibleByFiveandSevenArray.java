package javaa;

import java.util.Scanner;

public class numberDivisibleByFiveandSevenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		int n=obj.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] =obj.nextInt();
        }
        System.out.println("Numbers divisible by both 5 and 7 are:");
        for (int i = 0; i < n; i++) {
            if (arr[i] % 5 == 0 && arr[i] % 7 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
	}

