package javaa;

public class classExample1 {



static class Vehicle
{
	String brand_name;
	int price;
	void setVehicle(String bName,int p)
	{
		brand_name=bName;
		price=p;
	}
	void vehicle_display()
	{
		System.out.println(brand_name+"\t"+price);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle v=new Vehicle();
		v.setVehicle("Hyundai",3333333);
		v.vehicle_display();
		
		Vehicle v1=new Vehicle();
		v1.setVehicle("Honda",321111);		
		v1.vehicle_display();
		
		Vehicle v2=new Vehicle();
		v2.setVehicle("Kia",9999);
		v2.vehicle_display();
		
	}
}
}


