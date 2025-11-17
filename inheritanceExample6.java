package javaa;
class Emp {
 String name;
 int id;

 Emp(String name, int id) {
     this.name = name;
     this.id = id;
 }

 void work() {
     System.out.println(name + " is working.");
 }
}


class Doctor extends Emp {
 Doctor(String name, int id) {
     super(name, id);
 }

 
 void work() {
     System.out.println("Doctor " + name + " treats patients and writes prescriptions.");
 }
}

//Subclass Nurse
class Nurse extends Emp {
 Nurse(String name, int id) {
     super(name, id);
 }


 void work() {
     System.out.println("Nurse " + name + " assists doctors and cares for patients.");
 }
}


class Receptionist extends Emp{
 Receptionist(String name, int id) {
     super(name, id);
 }

 void work() {
     System.out.println("Receptionist " + name + " manages appointments and greets visitors.");
 }
}

public class inheritanceExample6 {
 public static void main(String[] args) {
     Emp e1 = new Doctor("Riddhi", 101);
     Emp e2 = new Nurse("Aastha", 102);
     Emp e3 = new Receptionist("Sana", 103);

     e1.work();
     e2.work();
     e3.work();
 }
}



	

