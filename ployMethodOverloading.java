package javaa;
class Mathh
{
	int addition(int number1,int number2)
	{
		return number1+number2;
	}
	int addition(int n1,int n2,int n3)
	{
		return n1+n2+n3;
	}
	float addition(int n1,float n2)
	{
		return n1+n2;
	}
}
public class ployMethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mathh obj=new Mathh();
		System.out.println(obj.addition(11,14));
		System.out.println(obj.addition(11,14.02f));
		
	}

}
