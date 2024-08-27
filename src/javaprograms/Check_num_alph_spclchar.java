package javaprograms;

import java.util.Scanner;

public class Check_num_alph_spclchar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);
		if (a >= 'A' && a <= 'Z' || a >= 'a' && a <= 'z') {
			System.out.println("Alphabets");

		} else if (a >= '0' && a <= '9') {
			System.out.println("Numbers");
		} else {
			System.out.println("Special Character");
		}
	}

}
