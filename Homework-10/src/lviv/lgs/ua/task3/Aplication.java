package lviv.lgs.ua.task3;

import java.util.Scanner;

public class Aplication {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("Enter a sentence: ");
			String str = scan.nextLine();
			if(calculateWords(str)==1) {
				System.out.println("There is 1 word in a sentence");
			} else {
				System.out.println("Your sentence has "+calculateWords(str)+ " words");
			}
			
		}

	}
	public static int calculateWords(String s) {
		String []strings = s.split(" ");
		return strings.length;
	}

}
