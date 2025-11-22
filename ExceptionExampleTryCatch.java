
package javaa;

public class ExceptionExampleTryCatch {

    public static void main(String[] args) {
        System.out.println("Program started...");
        System.out.println("Doing some calculations");

        int a = 20;
        int b = 10;
        int result1 = a + b;
        System.out.println("Addition result: " + result1);  

        System.out.println("Working with arrays...");
        int[] numbers = {5, 10, 15};
        System.out.println("First element: " + numbers[0]);

        System.out.println("Step 3: Now dividing by zero...");

        
        try {
            int result2 = 10 / 0;   
            System.out.println("Division result: " + result2);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");  
        }

        System.out.println("This line WILL run because exception is handled.");
        System.out.println("Program ended successfully.");
    }
}
