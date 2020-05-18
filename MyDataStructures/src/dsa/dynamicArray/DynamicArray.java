package dsa.dynamicArray;

public class DynamicArray {
	
	int size;
	int cap;
	int[] list;
	
	public DynamicArray() {
		list = new int[cap];
		setSize(0);
		setCap(4);
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
	
	public int get(int index) {
		if ( index >= this.getSize() || index < 0) {
			throw new IllegalArgumentException();
		}
		
		return this.list[index];
		
	}
	
	public void addLast(int element) {
		
		this.ensureCap(this.getSize() + 1);
		this.list[this.getSize()] = element;
		
		size++;
		
	}
	
	public void ensureCap(int cap) {
		if (cap >= this.getCap()) {
			int[] list2 = new int[this.getCap() * 2];
			for( int i = 0; i < this.getSize(); i++) {
				list2[i] = this.get(i);
			}
			
			this.setCap(this.getCap() * 2);
			
		}
	}

}
