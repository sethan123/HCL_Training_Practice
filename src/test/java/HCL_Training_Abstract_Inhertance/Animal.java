
//2) Write a Java program to create an abstract class Animal with abstract methods eat() and sleep(). 
//Create subclasses Lion, Tiger, and Deer that extend the Animal class and implement the eat() and sleep() methods 
//differently based on their specific behavior.
//
// 
//
//Sample output:
//Lion eats meat.
//Lion sleeps on grassland.
//
// 
//
//Tiger eats meat and occasionally hunts in water.
//Tiger sleeps in a hidden spot.
//
// 
//
//Deer grazes on grass and leaves.
//Deer sleeps in open fields.


package HCL_Training_Abstract_Inhertance;



abstract class Animal {
    public abstract void eat();
    public abstract void sleep();
}

class Lion extends Animal {
    public void eat() {
        System.out.println("Lion eats meat.");
    }

    public void sleep() {
        System.out.println("Lion sleeps on grassland.");
    }
}

class Tiger extends Animal {
    public void eat() {
        System.out.println("Tiger eats meat and occasionally hunts in water.");
    }

    public void sleep() {
        System.out.println("Tiger sleeps in a hidden spot.");
    }
}

class Deer extends Animal {
    public void eat() {
        System.out.println("Deer grazes on grass and leaves.");
    }

    public void sleep() {
        System.out.println("Deer sleeps in open fields.");
    }
}

