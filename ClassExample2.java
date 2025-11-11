package javaa;

public class ClassExample2 {

    static class Person {
        String person_name;
        int age;

        void setPerson(String pName, int a) {
            person_name = pName;
            age = a;
        }

        void person_display() {
            System.out.println(person_name + "\t" + age);
        }
    }

    public static void main(String[] args) {

        Person p = new Person();
        p.setPerson("Aaysha", 19);
        p.person_display();

        Person p1 = new Person();
        p1.setPerson("Aastha", 20);
        p1.person_display();

        Person p2 = new Person();
        p2.setPerson("Zeenat",21);
        p2.person_display();
    }
}
