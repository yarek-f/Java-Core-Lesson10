package lviv.lgs.ua.task4;

import java.util.Arrays;
import java.util.Scanner;

public class Aplication {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.println("Enter a sentence: ");
			String str = scan.nextLine();
			System.out.println(rapidWord(str));
			
		}

	}
	public static String rapidWord(String s) {
		String []strings = s.split(" ");
		Arrays.sort(strings);
		int[] quantity = new int[strings.length]; 
		int maxCount = 0; 
        int index = 0; 
        for(int i=0; i<strings.length; i++) {
        	for(int j=0; j<strings.length;j++) {
        		if(strings[i].equals(strings[j]))
        			quantity[i]++;
        	}
        }
        for(int i=0; i<quantity.length; i++) {
        	if(quantity[i]>maxCount) {
        		maxCount = quantity[i];
        		index=i;
        	}	
        }
        return (maxCount==1)
        		?"The most common word is absent"
        		:"The most common word is \""+strings[index]+"\"";
	}


}
