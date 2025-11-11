package javaa;
class Book {
    String title, author;
    double price;
    int quantity;

    void setDetails(String t, String a, double p, int q) {
        title = t;
        author = a;
        price = p;
        quantity = q;
    }

    double totalValue() {
        return price * quantity;
    }

    void display() {
        System.out.println(title + "\t" + author + "\t" + price + "\t" + quantity + "\tTotal: " + totalValue());
    }
}

public class CLassExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Book b1 = new Book();
        b1.setDetails("Java ", "James Gosling", 500, 10);
        b1.display();

        Book b2 = new Book();
        b2.setDetails("English", "Robert Frost", 6000, 5);
        b2.display();

        Book b3 = new Book();
        b3.setDetails("Maths", "R.D Sharams", 450, 8);
        b3.display();

        // Calculating the value
        double totalAll = b1.totalValue() + b2.totalValue() + b3.totalValue();
        System.out.println("\nTotal value of all copies of all books: " + totalAll);
   
	}

}
