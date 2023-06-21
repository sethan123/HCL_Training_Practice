//take below paragraph:
//"The Quick Brown fox jumps over the lazy dog dog lazy over jump brown fox fox jump brown over lazy lazy dog".
//
// 
//
//read above paragraph and get the individul words, and get the count of each word how many time repeatd.
//and insert in hashmap.
//for Example: hashmap should have fox as string and value as 3, becuase it is repeated thrice in paragraph.

 

package Collections;

import java.util.HashMap;

public class wordcount {
    public static void main(String[] args) {
        String paragraph = "The Quick Brown fox jumps over the lazy dog dog lazy over jump brown fox fox jump brown over lazy lazy dog";

       
        String[] words = paragraph.split(" ");

       
        HashMap<String, Integer> wordCounts = new HashMap<>();

        
        for (String word : words) {
            if (wordCounts.containsKey(word)) {
                
                int count = wordCounts.get(word);
                wordCounts.put(word, count + 1);
            } else {
              
                wordCounts.put(word, 1);
            }
        }

        
        for (String word : wordCounts.keySet()) {
            int count = wordCounts.get(word);
            System.out.println(word + ": " + "Count of the word-->  "+ count);
            System.out.println();
        }
    }
}
