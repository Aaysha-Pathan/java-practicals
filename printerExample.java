package javaa;
class Printer
{
	void print() {
		System.out.println("Printing differenyt printers");	
	}
	void testPrint(Printer p) {
		p.print();
	}
}
class LaserPrinter extends Printer{
	void print() {
		System.out.println("printing from laser printer");
	}
	
}

class InkjetPrinter extends Printer{
	void print() {
		System.out.println("printing from inkjet printer");
	}
	
	}
public class printerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer p=new Printer();
		LaserPrinter lp=new LaserPrinter();
		InkjetPrinter ip=new InkjetPrinter();
		p.testPrint(p);  
        p.testPrint(lp);     
        p.testPrint(ip);

	}

}
