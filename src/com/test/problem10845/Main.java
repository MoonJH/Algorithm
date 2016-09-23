package com.test.problem10845;

import java.util.Scanner;

class MyQueue {
	private int size;
	private MyQueueNode front, rear;
	
	private class MyQueueNode {
		int data;
		MyQueueNode link;
	}
	
	public void enqueue(int item) {
		if(empty()) {
			MyQueueNode newNode = new MyQueueNode();
			newNode.data = item;
			newNode.link = null;
			front = newNode;
			rear = newNode;
		}
		else {
			MyQueueNode newNode = new MyQueueNode();
			newNode.data = item;
			newNode.link = null;
			rear.link = newNode;
			rear = newNode;
		}
		size++;
	}
	
	public int dequeue() {
		if(front == rear) {
			int item = front.data;
			front = null;
			rear = null;
			size--;
			return item;
		}
		else {
			int item = front.data;
			MyQueueNode temp = front;
			front = null;
			front = temp.link;
			size--;
			return item;
		}
	}
	
	public int size() {
		return size;
	}
	
	public boolean empty() {
		if(front==null && rear==null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int peekFront() {
		return front.data;
	}
	
	public int peekRear() {
		return rear.data;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		MyQueue queue = new MyQueue();
		int N = scan.nextInt();
		
		for(int i=0; i<N; i++) {
			String command = scan.next();
			
			if(command.equals("push")) {
				int data = scan.nextInt();
				queue.enqueue(data);
			}
			else if(command.equals("pop")) {
				System.out.println(queue.empty() ? -1:queue.dequeue());
			}
			else if(command.equals("size")) {
				System.out.println(queue.size());
			}
			else if(command.equals("empty")) {
				System.out.println(queue.empty() ? 1:0);
			}
			else if(command.equals("front")) {
				System.out.println(queue.empty() ? -1:queue.peekFront());
			}
			else if(command.equals("back")) {
				System.out.println(queue.empty() ? -1:queue.peekRear());
			}
		}
		scan.close();
	}
}
