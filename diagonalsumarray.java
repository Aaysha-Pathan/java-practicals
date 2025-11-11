package javaa;
import java.util.Scanner;
public class diagonalsumarray {
	public static void main(String[] args) {
		        Scanner scan = new Scanner(System.in);
		        System.out.print("Enter number of rows: ");
		        int rows = scan.nextInt();
		        System.out.print("Enter number of columns: ");
		        int cols = scan.nextInt();
		        int[][] matrix = new int[rows][cols];
		        System.out.println("\nEnter elements of the matrix:");
		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < cols; j++) {
		                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
		                matrix[i][j] = scan.nextInt();
		            }
		        }
		        System.out.println("\nMatrix is:");
		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < cols; j++) {
		                System.out.print(matrix[i][j] + "\t");
		            }
		            System.out.println();
		        }
		        int diagonalSum = 0;
		        for (int i = 0; i < rows && i < cols; i++) {
		            diagonalSum += matrix[i][i];
		        }
		        System.out.println("\nSum of diagonal elements = " + diagonalSum);
		    }
	}


