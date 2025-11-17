package javaa;
class Animal1{
void makeSound() {
	System.out.print("Sound");
}
}
class Dogg extends Animal1{
	void makeSound() {
		System.out.println("bark");
	}
	
}
class catt extends Animal1{
	void makeSound() {
		System.out.println("meow");
	}
}
public class AnimalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Animal1[] animals = { new Dogg(), new catt()};//new Dogg(), new catt() };
            animals[0].makeSound();
	        animals[1].makeSound();
	      // animals[2].makeSound();
	        //animals[3].makeSound();
	}

	}
