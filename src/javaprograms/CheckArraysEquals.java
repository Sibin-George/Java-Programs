package javaprograms;

import java.util.Arrays;

public class CheckArraysEquals {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		int b[] = { 1, 2, 3, 4, 5 };

		Boolean c = Arrays.equals(a, b);
		if (c == true) {
			System.out.println("arrays are equal");
		} else {
			System.out.println("arrays are not equal");
		}

	}

}

//ANOTHER WAY TO CHECK

//public class CheckArraysEquals {
//	public static void main(String[] args) {
//		int a[] = { 1, 2, 3, 4, 5 };
//		int b[] = { 1, 2, 3, 4, 5 };
//	
//		boolean status = true;
//		if (a.length == b.length) {
//			for (int i = 0; i < a.length; i++) {
//				if (a[i] != b[i]) {
//					status = false;
//				}
//			}
//		} else {
//			status = false;
//		}
//		if (status == true) {
//			System.out.println("arrays are equal");
//		} else {
//			System.out.println("arrays are not equal");
//		}
//		
//	}
//
//}
