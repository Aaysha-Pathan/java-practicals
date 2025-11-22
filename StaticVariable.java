package javaa;
class flower1{
	static int flower1Count=0;
	flower1(){
		flower1Count++;
		
	}
}

public class StaticVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		flower1 f1 = new flower1();
        flower1 f2 = new flower1();
        flower1 f3 = new flower1();

        System.out.println("Total flowers created: " + flower1.flower1Count);
    }

}
