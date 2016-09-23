package com.test.problem10828;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		for(int i=0; i<N; i++) {
			String command = scan.next();
			
			if(command.equals("push")) {
				int data = scan.nextInt();
				stack.push(data);
			}
			else if(command.equals("pop")) {
				System.out.println(stack.isEmpty() ? -1:stack.pop());
			}
			else if(command.equals("size")) {
				System.out.println(stack.size());
			}
			else if(command.equals("empty")) {
				System.out.println(stack.isEmpty() ? 1:0);
			}
			else if(command.equals("top")) {
				System.out.println(stack.isEmpty() ? -1:stack.peek());
			}
		}
		scan.close();
	}
}