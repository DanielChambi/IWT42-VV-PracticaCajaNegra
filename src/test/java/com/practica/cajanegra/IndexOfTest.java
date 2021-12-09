package com.practica.cajanegra;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.Test;

import com.cajanegra.SingleLinkedListImpl;

public class IndexOfTest {
	@Test
	public void TC61() {
	    SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ('A', 'B', 'C', 'D', 'E', 'F', 'G');

	    assertEquals(initialList.indexOf('A'), 1);
	}
	
	@Test
	public void TC62() {
	    SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ('A', 'B', 'C', 'D', 'E', 'F', 'G');

	    assertEquals(initialList.indexOf('B'), 2);
	}
	
	@Test
	public void TC63() {
	    SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ('A', 'B', 'C', 'D', 'E', 'F', 'G');

		assertEquals(initialList.indexOf('D'), 4);
	}
	
	@Test
	public void TC64() {
	    SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ('A', 'B', 'C', 'D', 'E', 'F', 'G');

		assertEquals(initialList.indexOf('F'), 6);
	}
	
	@Test
	public void TC65() {
	    SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ('A', 'B', 'C', 'D', 'E', 'F', 'G');

		assertEquals(initialList.indexOf('G'), 7);
	}
	
	
	@Test
	public void TC66() {
		SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ('A', 'B', 'C', 'D', 'E', 'F', 'G');
		assertThrows(NoSuchElementException.class, () -> {
			initialList.indexOf('H');
		});
	}
	
	@Test
	public void TC67() {
		SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ('A', 'B', 'C', 'D', 'E', 'F', 'G');
		assertThrows(IllegalArgumentException.class, () -> {
			initialList.indexOf('@');
		});
	}
	
	@Test
	public void TC68() {
		SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ('A', 'B', 'C', 'D', 'E', 'F', 'G');
		assertThrows(IllegalArgumentException.class, () -> {
			initialList.indexOf('[');
		});
	}
}
