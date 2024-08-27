package javaprograms;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String a = sc.nextLine();
		
		String og = a;
		String rev = "";
		for (int i = a.length() - 1; i >= 0; i--) {
			rev = rev + a.charAt(i);
		}
		if (og.equals(rev)) {
			System.out.println("it is palindrome");
		} else {
			System.out.println("it is not palindrome");
		}
	}
}
