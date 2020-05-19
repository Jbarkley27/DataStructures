package dsa.linkedList;

public class LinkedList<E> {

	Node head;
	Node tail;
	int size;
	
	public LinkedList() {
		
		head = new Node(null, null);
		tail = head;
		this.size = 0;
	}
	
	
	public void add(int idx, E element) {
		if( idx > this.size || idx < 0) {
			throw new IllegalArgumentException();
		}
		
		if(this.getSize() == 0) {
			head = new Node(element, head);
			tail = head;
			
			
		} else if (idx == this.getSize()) {
			addLast(element);
			return;
			
		} else if (idx == 0){
			addFirst(element);
			return;
			
		} else {
		
			Node current = head;
			
			for ( int i = 0; i < idx - 1; i++) {
				current = current.getNext();
			}
			
			Node n = new Node(element, current.getNext());
			current.setNext(n);
		}
		
		size++;
		
	}
	
	public void addLast(E element) {
		Node n = new Node(element, null);
		
		tail.setNext(n);
		tail = n;
		size++;
	}
	
	public void addFirst(E element) {
		head = new Node(element, head);
		size++;
	}
	
	public E remove(int idx) {
		if(idx > this.getSize() || idx < 0) {
			return (E) "Wrong index";
		}
		
		if(idx == 0) {
			E rmv = head.getData();
			head = head.getNext();
			size--;
			return rmv;
		}
		Node current = head;
		
		for( int i = 0; i < idx - 1; i++) {
			current = current.getNext();
		}
		E rmv = current.getNext().getData();
		current.setNext(current.getNext().getNext());
		
		size--;
		return rmv;
	}
	
	public E get(int idx) {
		
		if(idx == 0) {
			return head.getData();
		}
		
		if(idx == this.getSize() - 1) {
			return tail.getData();
		}
		
		Node current = head;
		
		for(int i = 0; i < idx; i++) {
			current = current.getNext();
		}
		
		return current.getData();
	}
	
	public void display() {
		Node current = head;
		if(this.getSize() == 0) {
			System.out.println("Empty");
			return;
		}
		while(current != null) {
			
			System.out.print(current.getData() + " --> ");
			current = current.getNext();
		}
		
		System.out.print("\n");
	}
	
	
	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}




	public class Node {
		
		E data;
		Node next;
		
		
		public Node(E element, Node next) {
			setData(element);
			setNext(next);
		}


		/**
		 * @return the data
		 */
		public E getData() {
			return data;
		}


		/**
		 * @return the next
		 */
		public Node getNext() {
			return next;
		}


		/**
		 * @param data the data to set
		 */
		public void setData(E data) {
			this.data = data;
		}


		/**
		 * @param next the next to set
		 */
		public void setNext(Node next) {
			this.next = next;
		}
		
	}
}
