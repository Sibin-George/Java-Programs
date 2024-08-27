package javaprograms;

public class FindDuplicateArray {
	public static void main(String[] args) {
		String a[] = {"hi","hello","poda","hi" };
		boolean flag = false;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println("Duplicate element is found:" + a[i]);
					flag = true;
				}
			}
		}
		if (flag == false) {
			System.out.println("Duplicate element not found");
		}
	}

}
