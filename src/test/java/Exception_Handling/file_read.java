//2) Write a Java program to create a method that reads a file and throws an exception if the file is not found.
//
// 
//
//Sample output:
//Error: test1.txt (The system cannot find the file specified)

 
package Exception_Handling;

import java.io.File;
import java.util.Scanner;

public class file_read {

	public static void main(String[] args) {
		
		try {
			File f= new File("test1.txt");
			Scanner sc = new Scanner(f);
			System.out.println("File is found");
			
			
		}catch (Exception  e) {
			
			System.out.println("The system cannot find the file specified");
			
		}


	}

}
