package Exception_Handling;
//3) Write a Java program that reads a list of integers from the user and throws an exception if any numbers are duplicates.
//Sample output:
//How many numbers do you want to input? 5
//Input the integers:
//1
//2
//3
//4
//5
//No duplicate numbers!
//
// 
//
//How many numbers do you want to input? 6
//Input the integers:
//1
//2
//3
//3
//4
//5
//Error: Duplicate number found: 3


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers do you want to input? ");
        int count = scanner.nextInt();

        System.out.println("Input the integers:");
        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }

        try {
            checkDuplicates(numbers);
            System.out.println("No duplicate numbers!");
        } catch (Exception e) {
            System.out.println("Error: Duplicate number found: " + e.getMessage());
        }

        scanner.close();
    }

    public static void checkDuplicates(int[] numbers) throws Exception {
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (int number : numbers) {
            if (!uniqueNumbers.add(number)) {
                throw new Exception(Integer.toString(number));
            }
        }
    }
}
