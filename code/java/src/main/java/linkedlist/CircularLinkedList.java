package linkedlist;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CircularLinkedList {

	private static final Logger logger = LogManager.getLogger(CircularLinkedList.class);

	private CirNode head;
	
	public void add() {
//	tail should point to head	
	}
	
	public void print() {
		
	}
	
	public void delete() {
		
	}
	
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);

		logger.debug(list);
		
		Queue<Integer> q = new LinkedList<Integer>();
		Stack<Integer> stack = new Stack<Integer>();
		
		
		

	}

}

class CirNode {
	Integer data;
	CirNode next;

	public void setData(Integer data) {
		this.data = data;
	}

	public void setNext(CirNode next) {
		this.next = next;
	}

	public CirNode(Integer data, CirNode next) {
		super();
		this.data = data;
		this.next = next;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((next == null) ? 0 : next.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CirNode other = (CirNode) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (next == null) {
			if (other.next != null)
				return false;
		} else if (!next.equals(other.next))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CirNode [data=" + data + ", next=" + next + "]";
	}

}
