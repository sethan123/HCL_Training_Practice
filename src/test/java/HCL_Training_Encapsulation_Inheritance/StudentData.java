
//Write a code to create a class 'Student' and a method 'studentDetails()',declare variables (stdName, stdRollNo,stdId) as private
//Apply public setter and getter method for each private vairable in the class. 
//Call getter method to read the value of variables and print it on console. 
//Example::
//Sample Output: 
//       Student's Name: Kranthi
//       Student's Roll no.: 4 
//       Student's Id: 12345

package HCL_Training_Encapsulation_Inheritance;




class Student {
    private String stdName;
    private int stdRollNo;
    private int stdId;

    public void setStdName(String name) {
        stdName = name;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdRollNo(int rollNo) {
        stdRollNo = rollNo;
    }

    public int getStdRollNo() {
        return stdRollNo;
    }

    public void setStdId(int id) {
        stdId = id;
    }

    public int getStdId() {
        return stdId;
    }

    public void studentDetails() {
        System.out.println("Student's Name: " + getStdName());
        System.out.println("Student's Roll no.: " + getStdRollNo());
        System.out.println("Student's Id: " + getStdId());
    }
}

public class StudentData {
    public static void main(String[] args) {
        Student student = new Student();

        student.setStdName("Kranthi");
        student.setStdRollNo(4);
        student.setStdId(12345);

        student.studentDetails();
    }
}