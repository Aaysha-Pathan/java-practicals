package javaa;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("program started..");
		System.out.println("Doing some calculations");
		int a=20;
		int b=10;
		int result1=a+b;
		System.out.println("addition result: +result1");
		 System.out.println(" Working with arrays...");
	        int[] numbers = {5, 10, 15};
	        System.out.println("First element: " + numbers[0]);

	        System.out.println("Step 3: Now dividing by zero...");
	        int result2 = 10 / 0;    
	        System.out.println("This line will not run.");
    }
}


	

