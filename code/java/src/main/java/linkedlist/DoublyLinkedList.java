package linkedlist;

public class DoublyLinkedList {

	public DoublyNode head;

	public void add() {

	}

	public void print() {

	}

	public void deleteFirstOccurrence(int data) {

	}

	public static void main(String[] args) {

	}

}

class DoublyNode {
	Integer data;
	DoublyNode prev;
	DoublyNode next;

	public DoublyNode(Integer data, DoublyNode prev, DoublyNode next) {
		super();
		this.data = data;
		this.prev = prev;
		this.next = next;
	}

	public Integer getData() {
		return data;
	}

	public DoublyNode getPrev() {
		return prev;
	}

	public DoublyNode getNext() {
		return next;
	}

	@Override
	public String toString() {
		return "DoublyNode [data=" + data + ", prev=" + prev + ", next=" + next + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((next == null) ? 0 : next.hashCode());
		result = prime * result + ((prev == null) ? 0 : prev.hashCode());
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
		DoublyNode other = (DoublyNode) obj;
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
		if (prev == null) {
			if (other.prev != null)
				return false;
		} else if (!prev.equals(other.prev))
			return false;
		return true;
	}

}
