package com.test.problem6588;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		while(n!=0){
			goldbach(n);
			n = scan.nextInt();
		}
		scan.close();
	}
	
	private static void goldbach(int n) {
		int a=3;
		int b=0;
		do {
			b = n-a;
			if(checkPrime(a) && checkPrime(b))
				break;
			a+=2;
		} while(n<a+b);
		
		if(n==a+b)
			System.out.println(n+" = "+a+" + "+b);
		else
			System.out.println("Goldbach's conjecture is wrong.");
	}
	
	private static boolean checkPrime(int n) {
		for(int i=2; i*i<=n; i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
}
