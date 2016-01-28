/**
 * 
 */
package LinkedLists;

import LinkedLists.SingleLinkedList.Node;

/**
 * @author Rahul
 *
 */
public class DoubleLinkedList {
 Node head;
 public class Node {
		Node next = null;
		Node prev = null;
		Object data;
 }
 public boolean isEmpty() {
	 return head==null;
 }
}
