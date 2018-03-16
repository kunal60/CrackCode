package LinkedList;

//  https://www.youtube.com/watch?v=njTh_OwMljA
public class LinkedListDemo {

	public static void main(String[] args) {
		Node n = new Node(10);
		n.append(20);
		n.append(30);
		n.append(40);
		traverse(n);

	}

	static void traverse(Node n) {
		Node head = n;
		while (head.next != null) {
			System.out.println(head.data);
			head = head.next;
		}

		System.out.println(head.data);

	}

}

class Node {
	int data;
	Node next = null;

	Node(int data) {

		this.data = data;
	}

	public void append(int data) {
		Node end = new Node(data);

		Node current = this;

		while (current.next != null) {
			current = current.next;
		}
		current.next = end;
	}

}
