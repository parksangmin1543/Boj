package stack;

public class Main {
	class Node<T> {
		Node<T> next = null;
		T data = null;
	}
	
	public class ListStack<T> {
		Node<T> head = null;
		Node<T> buttom = null;
		
		public void push(T data) {
			Node<T> newNode = new Node<>();
			
			newNode.data = data;
			
			if (!isEmpty()) 
				newNode.next = this.head;
			
			this.head = newNode;
		}
		
		
	}
	

	
	
}
