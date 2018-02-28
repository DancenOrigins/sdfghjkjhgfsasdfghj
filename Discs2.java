package sdfghjk;

import java.util.Scanner;

public class Discs2 {
	
	public static void main(String[] args) {
		System.out.println("why dont you put in your name you hairless chimpanzee");
		Scanner scanner = new Scanner (System.in);
		String text = scanner.nextLine();
		
		int lenth = text.length()-2;
		
		char c1 = text.charAt(lenth);
		char c2 = text.charAt(0);

		System.out.println(c1 + " " + c2);
		
		scanner.close();

	}

}

