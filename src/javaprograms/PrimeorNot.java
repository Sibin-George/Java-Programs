package javaprograms;

import java.util.Scanner;

public class PrimeorNot {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int x=sc.nextInt();
	int count=0;
	if(x>1) {
		for(int i=1;i<=x;i++) {
			if(x%i==0)
			{
				count++;
			}
			
		}if(count==2) {
			System.out.println("it is prime ");
		}
		else {
			System.out.println("it is not prime");
	}
	}else {
		System.out.println("it is not prime");
	}
	}

}
