package dsa.linkedList;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListTest {

	LinkedList<String> list = new LinkedList<String>();
	
	@Test
	public void test() {
		list.display();
		
		list.add(0, "2");
		list.add(1, "4");
		list.add(2, "5");
		
		list.display();
		
		list.add(1, "3");
		list.display();
		
		list.addFirst("1");
		
		list.display();
		list.addLast("6");
		list.addLast("12");
		list.addLast("8");
		
		list.display();
		
		list.remove(list.getSize() - 2);
		list.display();
		
		list.remove(0);
		list.display();
		
		list.add(0, "1");
		list.add(6, "7");
		
		list.display();
		
		
		System.out.println(list.get(0));
		
		System.out.println(list.get(list.getSize() - 1));
		
		System.out.println(list.get(4));
		
		System.out.println(list.get(1));
	}

}
