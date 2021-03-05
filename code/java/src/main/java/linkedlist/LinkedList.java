package linkedlist;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LinkedList {
	private static final Logger logger = LogManager.getLogger(LinkedList.class);

	public Node head;
	public Node last;

	public Node getHead() {
		return head;
	}

	private void print() {
		if (null == head) {
			logger.error("List is empty!");
			return;
		}

		Node current = head;

		while (current != null) {
			logger.debug(current.getData());
			current = current.next;
		}

	}

	private void addHead(Integer data) {
		Node newNode = new Node(data, null);

		if (null == head) {
			head = newNode;
			return;
		}

		newNode.next = head;
		head = newNode;
	}

	private void addLast(Integer data) {
		Node newNode = new Node(data, null);

		if (null == head) {
			head = newNode;
			return;
		}

		Node current = head;

		while (current.next != null) {
			current = current.next;
		}

		current.next = newNode;
	}

	private void addRandomPostion(Integer data, Integer postiton) {
		Node newNode = new Node(data, null);
		if (postiton < 1) {
			logger.error("Position should be greater than 0");
			return;
		}
		if (postiton == 1) {
			newNode.next = head;
			head = newNode;
			return;
		}

		if (null == head) {
			logger.error("Head is null");
			return;
		}

		int count = 1;
		Node current = head;
		Node parent = head;

		while (count < postiton && current != null) {
			count++;
			parent = current;
			current = current.next;
		}

		parent.next = newNode;
		newNode.next = current;
	}

	private int size() {
		if (null == head) {
			logger.error("List is empty!");
			return 0;
		}

		int count = 0;
		Node current = head;

		while (current != null) {
			count++;
			current = current.next;
		}
		return count;
	}

	private void deleteHead() {
		if (null == head) {
			return;
		}

		Node current = head;

		head = head.next;
		current.next = null;

	}

	private void deleteAtPostion(int position) {
//		TODO : Brijesh
	}

	private void deleteFirstOccurence(int data) {
//		TODO : Brijesh
	}

	public static void main(String[] args) {
//		Add a node to ll
//			Last
//			First
//			Random Place
//		Size of ll
//		Delete from ll

		Node nextToNext = new Node(3, null);
		Node next = new Node(2, nextToNext);

		LinkedList list = new LinkedList();
		list.head = new Node(1, next);

		list.print();

		list.addHead(0);
		logger.debug("Added 0 as head");
		list.print();

		list.addLast(4);
		logger.debug("Added 4 at last");
		list.print();

		logger.debug("Size of ll: [{}]", list.size());

		list.deleteHead();
		logger.debug("Deleted head");
		list.print();

		list.addRandomPostion(22, -2);
		logger.debug("Added 22 at -2");
		list.print();
		
	}

}

class Node<E> {
	Integer data;
	Node next;

	public Node(Integer data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}

	public Integer getData() {
		return data;
	}

	public Node getNext() {
		return next;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}

}
