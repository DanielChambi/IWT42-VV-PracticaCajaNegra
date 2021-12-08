package com.practica.cajanegra;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.cajanegra.AbstractSingleLinkedListImpl;
import com.cajanegra.SingleLinkedListImpl;

public class GetAtPosTest {
	@Test
	public void TC51() {
	    SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ('A', 'B', 'C', 'D', 'E');

	    assertEquals(initialList.getAtPos(1), 'A');
	}
	
	@Test
	public void TC52() {
	    SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ('A', 'B', 'C', 'D', 'E');

	    assertEquals(initialList.getAtPos(5), 'E');
	}
	
	@Test
	public void TC53() {
	    SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ('A', 'B', 'C', 'D', 'E');

	    assertEquals(initialList.getAtPos(2), 'B');
	}
	
	@Test
	public void TC54() {
	    SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ('A', 'B', 'C', 'D', 'E');

	    assertEquals(initialList.getAtPos(3), 'C');
	}
	
	@Test
	public void TC55() {
	    SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ('A', 'B', 'C', 'D', 'E');

	    assertEquals(initialList.getAtPos(4), 'D');
	}
	
	
	@Test
	public void TC56() {
		SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ('A', 'B', 'C', 'D', 'E');
	    assertThrows(IllegalArgumentException.class, () -> {
	    	initialList.getAtPos(0);
	    });
	}
	
	@Test
	public void TC57() {
		SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ('A', 'B', 'C', 'D', 'E');
	    assertThrows(IllegalArgumentException.class, () -> {
	    	initialList.getAtPos(6);
	    });
	}
}
