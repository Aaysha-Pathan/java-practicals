package javaa;
//A final class cannot be extended
final class flower{
	void bloom() {
		System.out.println("the flower is blooming");
	}
}
public class FinalClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		flower f=new flower();
		f.bloom();

	}

}
