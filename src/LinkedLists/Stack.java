package LinkedLists;

public class Stack {
	
	Node head;

	public class Node {
		Node next;
		int data;
	}
	
	public boolean isEmpty() {
		if(head == null){
			return true;
		}
		return false;
	}
	public Node push(Node node) {
		if(isEmpty()){
			head = node;
		}
		Node newNode = node;
		newNode.next =head;
		head = newNode;
		return node;
	}
	
	public Node pop(){
		Node removeNode = head;
		head = head.next;
		//removeNode = null;
		return removeNode;
	}
	
	public Node peek(){
		return head;
	}
	
}
