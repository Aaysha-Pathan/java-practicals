package javaa;
import java.util.Scanner;

public class userValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj= new Scanner(System.in);
		System.out.print("Enter you name: ");
		String name = obj.nextLine();
		System.out.print("Enter your age: ");
		int age = obj.nextInt();
		//adding this line because it will not read it 
		obj.nextLine();
		System.out.print("Enter you address: ");
		String address = obj.nextLine();
			}

}
