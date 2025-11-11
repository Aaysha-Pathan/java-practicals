package javaa;

class BankAccount
	{
		int accNumber,balance;
		String name;
		void setDetails(int aNumber,String aName,int abalance)
		{
			accNumber=aNumber;
			name=aName;
			balance=abalance;
		}
		void deposite(int amount)
		{
			
			balance+=amount;
		}
		void withdrow(int amount)
		{
			balance-=amount;
		}
		
		void display()
		{
			System.out.println(accNumber+"\t"+name+"\t"+balance);
		}
	}
public class ClassExample3 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			BankAccount obj1=new BankAccount();
			obj1.setDetails(123, "Zeenat", 20000);
			obj1.display();
			obj1.deposite(2000);
			obj1.withdrow(5000);
			obj1.display();
			
			
			BankAccount obj2=new BankAccount();
			obj2.setDetails(234, "Aaysha",20000);
			obj2.display();
			obj2.withdrow(2000);
			obj2.display();
			obj2.deposite(1200);
			obj2.display();
			
		}

	}
	

