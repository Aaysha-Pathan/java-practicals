package javaa;

public class oddnumberpattern {

	public static void main(String[] args) {
		        int num = 1;   
		        int i = 1;     
		        while (num <= 100) {
		           
		            for (int j = 1; j <= i && num <= 100; j++) {
		                System.out.print(num + " ");
		                num += 2; 
		            }
		            System.out.println(); 
		            i++; 
		        }
		    }
		}
