//Write a Java Program to reverse string.
//Note: do not use : reverse method directly, try to do regular way
//      using arrays or loops.

package String_Practice;

public class ReverseString {
    public static void main(String[] args) {
        String input = "chethan";
        String reversed = reverseString(input);
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);
    }

    public static String reverseString(String input) {
        char[] charArray = input.toCharArray();
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

           
            start++;
            end--;
        }

        return new String(charArray);
    }
}
