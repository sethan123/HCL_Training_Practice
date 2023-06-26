//Write a Java program that reads a list of numbers from a file and throws an exception if any of the numbers are positive.
//
// 
//
//Sample output:
//Content of test.txt:
//-1
//-2
//-3
//-4
//
// 
//
//All numbers are non-positive.
//
// 
//
//Content of test.txt:
//-1
//-2
//-3
//4
//
// 
//
//Error: Positive number found: 4

package Exception_Handling;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PositiveNumberChecker {
    public static void main(String[] args) {
        String filename = "test.txt";

        try {
            List<Integer> numbers = readNumbersFromFile(filename);
            checkPositiveNumbers(numbers);
            System.out.println("Content of " + filename + ":");
            for (int number : numbers) {
                System.out.println(number);
            }
            System.out.println("All numbers are non-positive.");
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found: " + filename);
        } catch (PositiveNumberException e) {
            System.out.println("Content of " + filename + ":");
            for (int number : e.getNumbers()) {
                System.out.println(number);
            }
            System.out.println("Error: Positive number found: " + e.getPositiveNumber());
        }
    }

    public static List<Integer> readNumbersFromFile(String filename) throws FileNotFoundException {
        List<Integer> numbers = new ArrayList<>();
        File file = new File(filename);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            int number = Integer.parseInt(line);
            numbers.add(number);
        }
        scanner.close();
        return numbers;
    }

    public static void checkPositiveNumbers(List<Integer> numbers) throws PositiveNumberException {
        for (int number : numbers) {
            if (number > 0) {
                throw new PositiveNumberException(numbers, number);
            }
        }
    }
}

class PositiveNumberException extends Exception {
    private List<Integer> numbers;
    private int positiveNumber;

    public PositiveNumberException(List<Integer> numbers, int positiveNumber) {
        this.numbers = numbers;
        this.positiveNumber = positiveNumber;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public int getPositiveNumber() {
        return positiveNumber;
    }
}
