package sdfghjk;

import java.util.Scanner;

public class Disc {
	
	public static void main(String[] args) {
		System.out.println("why dont you put in your name you hairless chimpanzee");
		Scanner scanner = new Scanner (System.in);
		String text = scanner.nextLine();
		
		int lenth = text.length()-1;
		
		char c1 = text.charAt(lenth);

		System.out.println(c1);
		
		scanner.close();

	}

}
