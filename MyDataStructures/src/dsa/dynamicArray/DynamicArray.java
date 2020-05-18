package dsa.dynamicArray;

public class DynamicArray<E> {
	
	private int size;
	private int cap;
	private E[] list;
	
	@SuppressWarnings("unchecked")
	public DynamicArray() {
		setSize(0);
		setCap(4);
		list = (E[]) (new Object[cap]);
	}

	/**
	 * @return the size
	 */
	public int getSize() {
		return this.size;
	}

	/**
	 * @return the cap
	 */
	public int getCap() {
		return this.cap;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}

	/**
	 * @param cap the cap to set
	 */
	public void setCap(int cap) {
		this.cap = cap;
	}
	
	public E get(int index) {
		if ( index >= this.getSize() || index < 0) {
			throw new IllegalArgumentException();
		}
		
		return this.list[index];
		
	}
	
	public void addLast(E element) {
		
		this.ensureCap(this.getSize() + 1);
		list[this.getSize()] = element;
		
		size++;
		
	}
	
	public void add(int idx, E element) {
		this.ensureCap(this.getSize() + 1);
		
		if ( idx >= this.getSize() || idx < 0) {
			throw new IllegalArgumentException();
		}
		
		
		
		for( int i = this.getSize(); i > idx; i--) {
			this.list[i] = this.list[i - 1];
			
		}
		
		this.list[idx] = element;
		size++;
		
	}
	
	
	public E set(int idx, E element) {
		if(idx < 0 || idx >= this.getSize()) {
			throw new IllegalArgumentException();
		}
		
		E rmv = this.list[idx];
		
		this.list[idx] = element;
		
		return rmv;
		
	}
	public E remove(int idx) {
		
		E rmv = this.list[idx];
		
		if ( idx >= this.getSize() || idx < 0) {
			throw new IllegalArgumentException();
		}
		
		for( int i = idx; i < this.getSize(); i++) {
			this.list[i] = this.list[i + 1];
		}
		
		this.list[this.getSize() - 1] = null;
		
		size--;
		
		return rmv;
	}
	
	
	
	public void ensureCap(int cap) {
		if (this.getSize() >= this.getCap()) {
			@SuppressWarnings("unchecked")
			E[] list2 = (E[]) (new Object[this.getCap() * 2]);
			for( int i = 0; i < this.getSize(); i++) {
				
				list2[i] = this.get(i);
			}
			
			this.setCap(this.getCap() * 2);
			
			this.list = list2;
			
		}
	}
	
	public void display() {
		for(int i = 0; i < this.getSize(); i++) {
			
			if( i == this.getSize() - 1) {
				System.out.print(this.get(i));
			} else {
				System.out.print(this.get(i) + " --> ");
			}
		}
		
		System.out.print("\n");
		
	}

}
