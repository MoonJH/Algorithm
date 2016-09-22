package com.test.problem1978;

import java.util.Scanner;

public class Main {
	
	private static int[] arr = new int[100];
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		for(int i=0; i<N; i++) {
			arr[i] = scan.nextInt();
		}
		
		int count = 0;
		for(int i=0; i<N; i++) {
			if(checkPrime(arr[i])) {
				count++;
			}
		}
		
		System.out.println(count);
		scan.close();
	}
	
	private static boolean checkPrime(int num) {
		boolean check  = true;
		
		if(num==2) {
			return check = true;
		}
		else if(num==1 || num%2==0) {
			return check = false;
		}
		
		for(int i=3; i*i<=num; i++) {
			if(num%i == 0) {
				check = false;
			}
		}
		return check;
	}
}
