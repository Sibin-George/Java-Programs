package javaprograms;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		//assign the value to variable 
		int orig_num=num;
		int rev=0;
	while(num!=0) {
		int rem=num%10;
		rev=rev*10+rem;
		num=num/10;
	}

	if(orig_num==rev) {
		System.out.println("it is palindrome");
	}else {

		System.out.println("it is not palindrome");
	}
	}

}
