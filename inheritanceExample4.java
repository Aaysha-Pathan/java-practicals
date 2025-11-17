package javaa;
class vehicle
{
	String brand;
	vehicle(String VB){
		brand=VB;	
	}
	
}
class car extends vehicle{
	String model;
	car(String VB,String CB){
		super(VB);
		model=CB;
	}
	void display() {
		System.out.println("Brand: "+ brand +"\nModel:" + model);
	}
	
}
public class inheritanceExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car c =new car("toyota","Thar");
		c.display();

	}

}
