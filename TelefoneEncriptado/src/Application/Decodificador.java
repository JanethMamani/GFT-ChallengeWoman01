package Application;

import java.util.Scanner;

public class Decodificador {
	public static void main(String[] args) {
		Scanner write = new Scanner(System.in);
		String word = write.nextLine();
		String mensagem = "";
		
		for (int i=0; i<word.length(); i++) {
			char letter = word.charAt(i);
			
			if(letter == 'A' || letter == 'B' || letter == 'C') {
				letter = '2';
			} else if (letter == 'D' || letter == 'E' || letter == 'F') {
				letter = '3';
			} else if (letter == 'G' || letter == 'H' || letter == 'I') {
				letter = '4';
			} else if (letter == 'J' || letter == 'K' || letter == 'L') {
				letter = '5';
			} else if (letter == 'M' || letter == 'N' || letter == 'O') {
				letter = '6';
			} else if (letter == 'P' || letter == 'Q' || letter == 'R' || letter == 'S') {
				letter = '7';
			} else if (letter == 'T' || letter == 'U' || letter == 'V') {
				letter = '8';
			} else if (letter == 'W' || letter == 'X' || letter == 'Y' || letter == 'Z') {
				letter = '9';
			}
			
			mensagem += letter;
		}
		
		System.out.println(mensagem);
	}

}
