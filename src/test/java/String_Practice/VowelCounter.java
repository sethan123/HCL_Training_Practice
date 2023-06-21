//write a java program to count the number of vowels in given string: "aeroplane is flying high"

package String_Practice;

public class VowelCounter {
    public static void main(String[] args) {
        String str = "aeroplane is flying high";
        int vowelCount = countVowels(str);
        System.out.println("Number of vowels: " + vowelCount);
    }
    
    public static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase(); 
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        
        return count;
    }
}
