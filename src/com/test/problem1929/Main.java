package com.test.problem1929;

import java.util.Scanner;

public class Main {
	
	private static boolean[] arr = new boolean[1000001];
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		for(int i=1; i<=1000000; i++) {
			if(checkPrime(i)) {
				arr[i] = true;
			}
			else {
				arr[i] = false;
			}
		}
		
		int M = scan.nextInt();
		int N = scan.nextInt();
		
		for(int i=M; i<=N; i++) {
			if(arr[i]) {
				System.out.println(i);
			}
		}
		scan.close();
	}
	
	private static boolean checkPrime(int num) {
		boolean check = true;
		
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
