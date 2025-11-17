package javaa;
class Animal
{
	void eat() 
	{
		System.out.println("Animal can eat");
	}
}
class mammal extends Animal
{
	void walk()
	{
		System.out.println("mammal can walk");
	}
}
class dog extends mammal
{
	void bark()
	{
	System.out.println("Dog can bark");
	}
}
public class InheritanceExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog objdog=new dog();
		objdog.bark();
		objdog.walk();
		objdog.eat();
	}

}
