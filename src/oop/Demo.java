package oop;

class Person {

    String name;
    String email;
    String phone;

    void walk() {
        System.out.println(name + " is walking.");
    }

    void eat() {
        System.out.println(email);
    }

    void sleep() {
        System.out.println(name + " is sleeping.");
    }

}

public class Demo {

    public static void main(String[] args) {
        //instantiate an object
        //pointing a variable to a class instance
        Person person1 = new Person();

        //define some properties
        person1.name = "Joe";
        person1.email = "joe@testemail.com";
        person1.phone = "7897894564";

        //abstraction
        //only see the properties that we are interested in
        person1.walk();
        person1.eat();
        person1.sleep();

        Person person2 = new Person();
        person2.name = "Sarah";
        person2.email = "sarah@testemail.com";
        person2.phone = "3213216548";
    }

        /*
        WE ARE COMMENTING OUT THIS CODE, AS IT WAS INEFFICIENT AND NOT REALLY
        OBJECT ORIENTED

        //Person

        // attributes, variables, adjectives, descriptors
        String name = "Joe";
        String email = "joe@testemail.com";
        String phone = "7897894564";

        // action, activity, behavior
        System.out.println(name + " is walking.");
        System.out.println(name + " is eating.");

        //what if we wanted to do this for another person?
        String name2 = "Sarah";
        String email2 = "sarah@testemail.com";
        String phone2 = "3213216548";

        // action, activity, behavior
        walking(name2);
        //System.out.println(name2 + " is walking.");
        //System.out.println(name2 + " is eating.");

        //what about binding attributes and properties together?
    }

    // enhance by adding functions to avoid duplicating code
    static void walking(String name) {
        System.out.println(name + " is walking.");
    }
    */

}