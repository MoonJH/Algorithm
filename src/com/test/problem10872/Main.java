package com.test.problem10872;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int answer = 1;
		
		for(int i=2; i<=N; i++) {
			answer *= i;
		}
		System.out.println(answer);
		scan.close();
	}
}
