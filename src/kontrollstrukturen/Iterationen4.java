package kontrollstrukturen;

import java.util.Scanner;

public class Iterationen4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter int x");
		int x = sc.nextInt();
		sc.close();
		
		for (int i = 2; i <= x*2; i = i+2) {
			System.out.println(i);
		}

	}

}