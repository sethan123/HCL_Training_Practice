package Exception_Handling;

//Write a Java program to create a method that takes a string as input and throws an exception if the string does not contain vowels.
//
//
//
//Sample output:
//Original string: Java handling and managing exceptions
//String contains vowels.
//
// 
//
//Original string: Typy gyps fly.
//Error: String does not contain any vowels


public class VowelChecker {
    public static void main(String[] args) {
        String str1 = "Java handling and managing exceptions";
        String str2 = "Typy gyps fly.";

        try {
            checkVowels(str1);
            System.out.println("Original string: " + str1);
            System.out.println("String contains vowels.");
        } catch (NoVowelsException e) {
            System.out.println("Original string: " + str1);
            System.out.println("Error: " + e.getMessage());
        }

        try {
            checkVowels(str2);
            System.out.println("Original string: " + str2);
            System.out.println("String contains vowels.");
        } catch (NoVowelsException e) {
            System.out.println("Original string: " + str2);
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void checkVowels(String str) throws NoVowelsException {
        if (!str.matches(".*[aeiouAEIOU].*")) {
            throw new NoVowelsException("String does not contain any vowels");
        }
    }
}

class NoVowelsException extends Exception {
    public NoVowelsException(String message) {
        super(message);
    }
}
