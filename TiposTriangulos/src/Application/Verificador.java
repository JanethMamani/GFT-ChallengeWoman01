package Application;

import java.util.Scanner;

public class Verificador {
	public static void main(String[] args) {
		Scanner writing = new Scanner(System.in);
		int a = writing.nextInt();
		int b = writing.nextInt();
		int c = writing.nextInt();
		
		if(a == b && a == c && b==c) {
			System.out.println("Equilátero");
		} else if(a == b && a == c) {
			System.out.println("Isósceles");
		}else if(a == b && b == c) {
			System.out.println("Isósceles");
		}else {
			System.out.println("Escaleno");
		}
		writing.close();
	}
}
