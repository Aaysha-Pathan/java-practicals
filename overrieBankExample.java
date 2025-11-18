package javaa;
class Bank
{
	int getInterestRate(){
		return 5;
	}
}
class HDFCBank extends Bank
{
	int getInterestRate(){
		return 6;
	}
}
class ICICIBank extends Bank
{
	int getInterestRate(){
		return 7;
	}
}
class SBIBank extends Bank
{
	int getInterestRate(){
		return 9;
	}
}
public class overrieBankExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Bank hdfc = new HDFCBank();
	        Bank icici = new ICICIBank();
	        Bank sbi = new SBIBank();

	        System.out.println("HDFC Interest Rate: " + hdfc.getInterestRate());
	        System.out.println("ICICI Interest Rate: " + icici.getInterestRate());
	        System.out.println("SBI Interest Rate: " + sbi.getInterestRate());

	}

}
