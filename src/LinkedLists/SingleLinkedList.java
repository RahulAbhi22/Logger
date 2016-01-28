/**
 * 
 */
package LinkedLists;

/**
 * @author Rahul
 *
 */
public class SingleLinkedList {
	/*
	 * To create a Node with data
	 * And use it all over the Outer Main SingleListClass 
	 */
	Node head;
	int size;
	public class Node {
		Node next = null;
		Object data;
		
	}
	
	SingleLinkedList() {
		size =0;
	}
	//Check whether List is empty
	public boolean isEmpty() {
		boolean flag = head == null ? true : false;
		return flag;
	}
	
	//Insert the Node at the end
	public void insertAtEnd(Node newNode) {
		if(isEmpty()) {
			head = newNode;
		}
		else{
			Node current = head;
			while(current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
		size++;
		
	//	
	}
	//Insert the Node at any Specific position
	public void insert(int position, Node newNode) {
		int currentPos =1;
		Node current = head;
		Node temp = null;
		System.out.println(head.data+"**Head***");
		if(position == 1) {
			temp = head;
			newNode.next = temp;
			head= newNode;
		}
		else{
			while(currentPos < (position-1)) {
				currentPos++;
				if(current == null) {
					System.out.println("Either linked list is empty or the position exceeds the size of the list");
					return;
				}
				current = current.next;
				
			}
			temp = current.next;
			newNode.next = temp;
			current.next = newNode;
			
		}
		
	}
	
	public  Node delete(int pos) {
		int currentPos = 1;
		Node current = head;
		if(pos == 0){
			Node temp = head;
			head = temp.next;
			return temp;
		}
		else{
			while(currentPos < (pos-1)){
				currentPos++;
				if(current == null) {
					System.out.println("Either linked list is empty or the position exceeds the size of the list");
					current = current.next;
				}
			}
			Node temp = current.next;
			current.next = current.next.next;
			return temp;
		}
	}
	
	//Display the Linked List
	
	public void displayList(){
		if(isEmpty()){
			System.out.println("The List is Empty");
		}
		Node current = head;
		while(current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}

}
