package com.test.problem10779;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String stick = scan.next();
		Stack<Integer> stack = new Stack<Integer>();
		int ans = 0;
		
		for(int i=0; i<stick.length(); i++) {			
			if(stick.charAt(i) == '(') {
				stack.push(i);
			}
			else {
				if(stack.peek()+1 == i) {
					stack.pop();
					ans += stack.size();
				}
				else {
					stack.pop();
					ans += 1;
				}
			}
		}
		System.out.println(ans);
		scan.close();
	}
}