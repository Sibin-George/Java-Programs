package javaprograms;

import java.util.Arrays;

public class Find_missing_no_array {
	public static void main(String[] args) {
		int[] a = { 3, 1, 2, 6, 4 };
		Arrays.sort(a);
		int sum = 0, sum2 = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		int max = a[a.length - 1];
		for (int i = 1; i <= max; i++) {
			sum2 = sum2 + i;
		}

		System.out.println("Sorted array: " + Arrays.toString(a));
		System.out.println("sum of range of array : " + sum);
		System.out.println("missing number : " + (sum2 - sum));
	}

}
