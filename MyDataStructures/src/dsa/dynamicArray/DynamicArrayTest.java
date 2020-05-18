package dsa.dynamicArray;

import static org.junit.Assert.*;

import org.junit.Test;

public class DynamicArrayTest<E> {

	DynamicArray<String> list = new DynamicArray<String>();
	@Test
	public void allFunctions() {
		assertEquals(0, list.getSize());
		list.addLast("one");
		list.addLast("three");
		
		assertEquals(2, list.getSize());
		
		list.display();
		
		list.add(0, "newFirst");
		
		
		assertEquals(3, list.getSize());
		
		list.addLast("last");
		list.add(2, "two");
		
		assertEquals(5, list.getSize());
		
		list.display();
		
		list.add(4, "five");
		
		list.add(4, "four");
		
		list.display();
		
		list.remove(0);
		
		list.remove(2);
		
		list.display();
		
		list.set(2, "newThree");
		
		list.addLast("lastLast");
		
		list.display();
		
		list.set(list.getSize() - 1, "LAST");
		
		list.display();
	}

}
