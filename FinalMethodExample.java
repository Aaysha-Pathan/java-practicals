package javaa;
class parent
{
	final void showMessage() {
		System.out.println("This is a final Method");
	}
}
class child extends parent{
	//cannot override final method
}
public class FinalMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child c=new child();
		c.showMessage();

	}

}
//A method marked final cannot be overridden in subclasses