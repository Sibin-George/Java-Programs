package javaprograms;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number to search: ");
		int key = s.nextInt();
		int a[] = { 2, 4, 6, 7 };
		boolean flag = false;

		for (int i = 0; i < a.length; i++) {
			if (key == a[i]) {
				System.out.println("number found at position:" + i);
				flag = true;
				break;

			}
		}
		if (flag == false) {

			System.out.println("not found");
		}

	}

}
