package javaprograms;

public class FindMaxMinArray {
	public static void main(String[] args) {
		int a[] = { 20, 60, 50, 100, 10 };
		int max = a[0];
		int min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			} else if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("min:" + min);
		System.out.println("max:" + max);
	}

}

//ANOTHER WAY

//import java.util.Arrays;
//
//public class FindMaxMinArray {
//	public static void main(String[] args) {
//		int a[]= {20,60,50,10,40};
//		Arrays.sort(a);
//		
//		System.out.println("minimum value:"+a[0]);
//
//		System.out.println("maximum value:"+a[a.length-1]);
//	}
//
//	
//}