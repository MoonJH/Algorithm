package com.test.problem9012;

import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		Stack<Character> stack = new Stack<Character>();
		while(T-->0) {
			String data = scan.next();
			if(VPN(stack, data)) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
			stack.clear();
		}
		scan.close();
	}
	
	private static boolean VPN(Stack<Character> stack, String data) {
		for(int i=0; i<data.length(); i++) {
			char ch = data.charAt(i);
			switch(ch) {
			case '(' :
				stack.push(ch);
				break;
			case ')' :
				if(stack.isEmpty()) {
					return false;
				}
				stack.pop();
				break;
			}
		}
		if(stack.isEmpty())
			return true;
		else 
			return false;
	}
}
