package javaa;
class Shape
{
	float calculateArea()
	{
		System.out.println("In Shape class ");
		return 0.0f;
	}
}
class Circle extends Shape
{
	int radius;
	Circle(int radius1)
	{
		radius=radius1;
	}
	float calculateArea() {
		// TODO Auto-generated method stub
		float area=2*3.14f*radius;
		return area;
	}
}
class Triangle extends Shape
{
	int bi,h;
	Triangle(int b1, int h1)
	{
		bi=b1;
		h=h1;
	}
	
	float calculateArea() {
		// TODO Auto-generated method stub
		float area=0.5f*bi*h;
		return area;
	}
}
class Rectangle extends Shape
{
	int l,b;
	Rectangle(int l1,int b1)
	{
		l=l1;
		b=b1;
	}
	float calculateArea() {
		float area=l*b;
		return area;
	}
}
class Square extends Shape

{
	int side,sidee;
	Square(int side1,int sidee1)
	{
		side=side1;
		sidee=sidee1;
	}
	
	float calculateArea() {
		float area=side*sidee;
		return area;
		
	}
	
}
public class InheritanceExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle c=new Circle(12);
		float ans=c.calculateArea();
		System.out.println("Area of Circle "+ans);
		Triangle t=new Triangle(11,11);
		float answer=t.calculateArea();
		System.out.println("Area of Triangle "+answer);
		Rectangle r=new Rectangle(14,11);
		float anss=r.calculateArea();
		System.out.println("Area of Rectangle "+anss);
		Square s=new Square(14,14);
		float ans1=s.calculateArea();
		System.out.println("Area of Square "+ans1);	
	}

}