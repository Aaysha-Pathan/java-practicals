package javaa;

class Person {
    String name;
    int age;

    Person(String n, int a) {  
        name = n;   
        age = a;    
    }

    void display() {
        System.out.println(name + " " + age);
    }
}

class Employee extends Person {
    int salary;

    Employee(String n, int a, int s) {
        super(n, a);   
        salary = s;    
    }

    void displaySalary() {
        super.display();
        System.out.println(salary);
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Employee e = new Employee("xyz", 20, 20000);
        e.displaySalary();

        Person p = new Person("test", 23);
        p.display();
    }
}
