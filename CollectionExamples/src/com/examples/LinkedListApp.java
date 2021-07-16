package com.examples;

public class LinkedListApp {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.add(10);
		linkedList.add(20);
		linkedList.add(30);
		linkedList.add(40);
		linkedList.printElement();
		System.out.println(linkedList.getHead());
	}
	
	

}

class LinkedList {

	private Node head;
	private Node tail;

	public void add(int data) {

		Node newNode = new Node(data);
		if (head == null) {
			System.out.println("List is Empty adding First Element... i.e." + data);
			head = newNode;
			tail = newNode;
		} else {
			System.out.println("Adding " + data + " element to the last...");
			tail.next = newNode;
			tail = newNode;
		}
	}
	
	public void delete(int data) {
		System.out.println("Please provide implementation...");
	}

	public void printElement() {
		if (head == null) {
			System.out.println("List is empty...");
		} else {
			System.out.println("Printing element...");
			Node tempNode = head;
			while (tempNode != null) {
				System.out.print(tempNode.getData() + " ---> ");
				tempNode = tempNode.getNext();
			}
		}
	}

	public Node getHead() {
		return head;
	}
}

class Node {

	int data;
	Node next;

	public Node(int data) {
		super();
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public int getData() {
		return data;
	}

}