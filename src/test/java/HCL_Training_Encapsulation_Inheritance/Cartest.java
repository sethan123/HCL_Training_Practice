//Create create a class 'MyCar' and a method 'myCarInfo' and declare variables (color,name,regd.No),create constructor and initialize the three parameters (color,name,regd.No)
//Apply public getter method for each private vairable in the class.Without using the setter method,Update the values using the constructor and print the values using Getter methods.
//Sample Output: 
//      Car color:Red
//      Car name:Nexus
//      Car regd.No:123456789

package HCL_Training_Encapsulation_Inheritance;


class MyCar {
    private String color;
    private String name;
    private String regdNo;

    public MyCar(String color, String name, String regdNo) {
        this.color = color;
        this.name = name;
        this.regdNo = regdNo;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public String getRegdNo() {
        return regdNo;
    }

    public void myCarInfo() {
        System.out.println("Car color: " + getColor());
        System.out.println("Car name: " + getName());
        System.out.println("Car regd.No: " + getRegdNo());
    }
}

public class Cartest {
    public static void main(String[] args) {
        MyCar vechicle = new MyCar("Red", "Nexus", "123456789");

        vechicle.myCarInfo();
    }
}

