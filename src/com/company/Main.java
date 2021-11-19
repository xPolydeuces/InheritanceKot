package com.company;
import java.util.Scanner;

class Person {
    Scanner myObj = new Scanner(System.in);
    String last_name;
    String first_name;
    String street;
    String postcode;
    String city;

    void init(){
        System.out.println("Enter last name: ");
        this.last_name = myObj.nextLine();
        System.out.println("Enter first name: ");
        this.first_name = myObj.nextLine();
        System.out.println("Enter street name: ");
        this.street = myObj.nextLine();
        System.out.println("Enter postcode: ");
        this.postcode = myObj.nextLine();
        System.out.println("Enter city: ");
        this.city = myObj.nextLine();
    }

    void print(){
        System.out.println("Last name: " + this.last_name);
        System.out.println("First name: " + this.first_name);
        System.out.println("Street: " + this.street);
        System.out.println("Postcode: " + this.postcode);
        System.out.println("City: " + this.city);
    }
}

class Cadre extends Person {
    Person person = new Person();
    String education;
    String position;

    void init1(){
        person.init();
        System.out.println("Enter education level: ");
        this.education = myObj.nextLine();
        System.out.println("Enter current job position: ");
        this.position = myObj.nextLine();
    }

    void print1(){
        person.print();
        System.out.println("Education level: " + this.education);
        System.out.println("Job position: " + this.position);
    }

}

public class Main {

    public static void main(String[] args) {
        Cadre cadre = new Cadre();
        cadre.init1();
        cadre.print1();
    }
}
