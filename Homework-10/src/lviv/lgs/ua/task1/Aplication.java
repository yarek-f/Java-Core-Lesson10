package lviv.lgs.ua.task1;

import java.util.Scanner;

public class Aplication {
	
	public static void main(String[] args) throws Problem {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("Enter a word of 5 letters: ");
			String str = scan.next();
			if (str.length() != 5) {
				throw new Problem("Your word is wrong, try again");
			} else {
				checkWord(str);
			}
		}
		

	}

	public static void checkWord(String s) {
		StringBuilder strBuilder = new StringBuilder(s);
		strBuilder.reverse(); 
		String invertedText = strBuilder.toString();
		if (s.equalsIgnoreCase(invertedText)) {
			System.out.println("The word is a palindrome");
		} else {
			System.out.println("The word is not a palindrome");
		}
	}

}
