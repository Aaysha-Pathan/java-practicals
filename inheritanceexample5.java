package javaa;
//Base class
class Item {
 String title;
 double price;

 Item(String title, double price) {
     this.title = title;
     this.price = price;
 }

 void displayInfo() {
     System.out.println("Item Title: " + title);
     System.out.println("Price: " + price);
 }
}

//Subclass Book
class bookk extends Item {
 String author;

 bookk(String title, double price, String author) {
     super(title, price);
     this.author = author;
 }

 @Override
 void displayInfo() {
     System.out.println("---- Book Details ----");
     System.out.println("Title: " + title);
     System.out.println("Author: " + author);
     System.out.println("Price: " + price);
 }
}

//Subclass Magazine
class Magazine extends Item {
 int issueNumber;

 Magazine(String title, double price, int issueNumber) {
     super(title, price);
     this.issueNumber = issueNumber;
 }

 @Override
 void displayInfo() {
     System.out.println("---- Magazine Details ----");
     System.out.println("Title: " + title);
     System.out.println("Issue No: " + issueNumber);
     System.out.println("Price: " + price);
 }
}

//Subclass DVD
class DVD extends Item {
 int duration; // in minutes

 DVD(String title, double price, int duration) {
     super(title, price);
     this.duration = duration;
 }

 @Override
 void displayInfo() {
     System.out.println("---- DVD Details ----");
     System.out.println("Title: " + title);
     System.out.println("Duration: " + duration + " mins");
     System.out.println("Price: " + price);
 }
}
public class inheritanceexample5 {

 public static void main(String[] args) {
     Item b = new bookk("Java Basics", 300, "James Gosling");
     Item m = new Magazine("Tech World", 120, 42);
     Item d = new DVD("Avengers", 250, 180);

     b.displayInfo();
     m.displayInfo();
     d.displayInfo();
 }
}



