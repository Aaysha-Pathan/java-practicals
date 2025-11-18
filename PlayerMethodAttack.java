package javaa;
class Player
{
	void attack()
	{
		System.out.println("Player attacks!");
	}
	
}
class warrior extends Player
{
	void attack()
	{
		System.out.println("warrior hits with a sword!");
	}
}
class archer extends Player
{
	void attack()
	{
		System.out.println("The archer shoots an arrow");
	}
	
}
class mage extends Player
{
	void attack()
	{
		System.out.println("the mage casts a spell.");
	}
}
public class PlayerMethodAttack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player p1 = new warrior();
        Player p2 = new archer();
        Player p3 = new mage();

        p1.attack();
        p2.attack();
        p3.attack();
    }

}
