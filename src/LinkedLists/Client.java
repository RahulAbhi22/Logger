package LinkedLists;

import LinkedLists.SingleLinkedList.Node;

public class Client {
	
	public static void main(String args[]) {
		SingleLinkedList sll = new SingleLinkedList();
		Node firstnode = sll.new Node();
		firstnode.data = 15;
		sll.insertAtEnd(firstnode);
		
		Node secNode = sll.new Node();
		secNode.data = 20;
		sll.insertAtEnd(secNode);
		
		Node thirdNode = sll.new Node();
		thirdNode.data = 25;
		sll.insertAtEnd(thirdNode);
		//sll.displayList();
		
		Node fourthNode = sll.new Node();
		fourthNode.data = 30;
		sll.insert(1, fourthNode);
		
		sll.delete(2);
		
		sll.displayList();
	}

}
