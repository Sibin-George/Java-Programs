package javaprograms;

// using concatenation 

public class ReverseString {
	public static void main(String[] args) {
		
		String a = "ABCD";
		String rev = "";
		int len = a.length();

		for (int i = len - 1; i >= 0; i--) {
			rev = rev + a.charAt(i);
		}

		System.out.println(rev);

	}
}
