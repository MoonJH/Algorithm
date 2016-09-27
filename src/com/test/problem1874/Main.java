package com.test.problem1874;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	
	private static int[] arr;
	private static boolean[] check = new boolean[100001];
	private static Stack<Integer> stack;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		arr = new int[n];
		Arrays.fill(check, false);
		for(int i=0; i<n; i++) {
				arr[i] = scan.nextInt();
		}
		
		stack = new Stack<Integer>();
		int stackIndex=0;
		int arrIndex=0;
		Arrays.fill(check, true);
		while(arrIndex<=n) {
			if(stackIndex<=arr[arrIndex]) {
				if(stackIndex==arr[arrIndex]) {
					if(check[stackIndex]==false) {
						System.out.println("NO");
					}
					else {
						stack.pop();
						System.out.println("-");
						arrIndex++;
					}
				}
				else {
					stack.push(stackIndex);
					System.out.println("+");
					check[stackIndex] = false;
					stackIndex++;
				}
			}
			else {
				if(check[stackIndex]==false) {
					System.out.println("NO");
				}
				else {
					stack.pop();
					System.out.println("-");
					arrIndex++;
				}
			}			
			if(arrIndex>=n)
				break;
		}
		scan.close();
	}	
}
