//Question 1 - Inheritence 
//Build the classes Animal, Cat, and Bug.
//Define the properties "color" and "leg_number" on the relevant and necessary classes.
//Have them be initialized within a constructor.
//Add the functionality that would allow us to call a method "move" with the Cat and Bug classes.
//Have the method return a string "I'm moving with <number of legs> legs!", with the "<number of legs>" being leg_number as set on the class.
//Add a new class called Bird. Add the property "wing_number". Add the functionality that would allow us to call a method "move" with the Bird class.
//Have the method return the string "I'm moving with <number of legs> legs!"
//if wing_number doesn't have an applicable value. 
//If wing_number does have an applicable value, return the string "I'm flying".
		
		
package HCL_Training_Encapsulation_Inheritance;

class Animal {
    protected String color;
    protected int leg_number;
    
    public Animal(String color, int leg_number) {
        this.color = color;
        this.leg_number = leg_number;
    }
}

class Cat extends Animal {
    public Cat(String color, int leg_number) {
        super(color, leg_number);
    }
    
    public String move() {
        return "I'm walking with " + leg_number + " legs!";
    }
}

class Bug extends Animal {
    public Bug(String color, int leg_number) {
        super(color, leg_number);
    }
    
    public String move() {
        return "I'm walking with " + leg_number + " legs!";
    }
}

class Bird {
     int wing_number;
    
    public Bird(int wing_number) {
        this.wing_number = wing_number;
    }
    
    public String move() {
        if (wing_number > 0) {
            return "I'm flying";
        } else {
            return "I'm walking with 2 legs!";
        }
    }
}






public class InhertancePractise {

	public static void main(String[] args) {
		
		Cat cat = new Cat("black", 4);
        Bug bug = new Bug("green", 6);
        Bird bird1 = new Bird(2);
        Bird bird2 = new Bird(0);

        System.out.println("Cat " + cat.move());
        System.out.println("Bug " + bug.move());
        System.out.println("Bird1 " + bird1.move());
        System.out.println("Bird2 " + bird2.move());
	}

}


