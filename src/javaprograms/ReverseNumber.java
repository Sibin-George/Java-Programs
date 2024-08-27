package javaprograms;

import java.util.Scanner;

//method with argument with return type
public class ReverseNumber {
	
	static int Solution(int n) {
		int rev=0;
		while(n!=0) {
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		return rev;	
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int num=s.nextInt();
		System.out.println("rev:"+Solution(num));
		
	}

}



