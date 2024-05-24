package implementation;

@SuppressWarnings("hiding")
public class CircularlylinkedLIst<T> {

	private static class Node<T>{
		private T element;
		private Node<T>next;
		
		public Node(T e,Node<T>n) {
		this.element = e;
		this.next =n;
		}
		
		public T getElement() {
			return element;
		}
		public Node<T> getNext(){
			return next;
		}
		public void setNext(Node<T>n) {
			next = n;
		}
	}//end of inner class
	
	private Node<T> tail = null;
	private Node<T>head = null;
	private int size = 0;
	
	public int getsize() {
		return size;
	}
	public boolean isEmpty() {
		return size == 0;
	}
	
	public  T getfisrt(){
		if(isEmpty())
			return null;
		return head.getElement();
	}
	public T getlast() {
		if(isEmpty())
			return null;
		return tail.getElement();
	}
	
	public void addfisrt(T newest) {
		Node<T>newnode = new Node<>(newest,head);
		if(isEmpty()) {
			head = tail = newnode;
		}
		//firt always set newnode reference to first element/node which is the  head node
		newnode.setNext(head);
		head = newnode;
		tail.setNext(head);
		size++;
		
	}

	public void addlast(T newest) {
		Node<T>newnode = new Node<>(newest,tail);
		if(isEmpty()) {
			tail=head=newnode;
		}
		//firt always set newnode reference to next element/node which is the head node
		newnode.setNext(head);
		tail.setNext(newnode);
		tail = newnode;
		size++;
	}
	
public T removefirst() {
	T removed = head.getElement();
	head = head.getNext();
	tail.setNext(head);
	size--;
	return removed;
}

}


