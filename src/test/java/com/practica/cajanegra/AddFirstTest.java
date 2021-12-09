package com.practica.cajanegra;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

import java.util.logging.Logger;

import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import com.cajanegra.SingleLinkedListImpl;



public class AddFirstTest {
	
	@Test
	void TC21() {
		SingleLinkedListImpl<Character> initialList = new SingleLinkedListImpl<Character>('A','A','A','A','A');
		SingleLinkedListImpl < Character > expectedList = new SingleLinkedListImpl < Character > ('P','A','A','A','A','A');
		initialList.addFirst('P');
		
		assertTrue(initialList.toString().equals(expectedList.toString()));
	}
	
	@Test
	void TC22() {
		SingleLinkedListImpl<Character> initialList = new SingleLinkedListImpl<Character>('A','A','A','A','A');
		SingleLinkedListImpl < Character > expectedList = new SingleLinkedListImpl < Character > ('A','A','A','A','A','A');
		initialList.addFirst('A');
		
		assertTrue(initialList.toString().equals(expectedList.toString()));
	}
	    
	@Test
	void TC23() {
		SingleLinkedListImpl<Character> initialList = new SingleLinkedListImpl<Character>('A','A','A','A','A');
		SingleLinkedListImpl < Character > expectedList = new SingleLinkedListImpl < Character > ('P','A','A','A','A','A');
		initialList.addFirst('Z');
		
		assertTrue(initialList.toString().equals(expectedList.toString()));
	}
	
	@Test
	void TC24() {
		SingleLinkedListImpl<Character> initialList = new SingleLinkedListImpl<Character>('A','A','A','A','A');
		SingleLinkedListImpl < Character > expectedList = new SingleLinkedListImpl < Character > ('P','A','A','A','A','A');
		initialList.addFirst('B');
		
		assertTrue(initialList.toString().equals(expectedList.toString()));
	}
	
	@Test
	void TC25() {
		SingleLinkedListImpl<Character> initialList = new SingleLinkedListImpl<Character>('A','A','A','A','A');
		SingleLinkedListImpl < Character > expectedList = new SingleLinkedListImpl < Character > ('P','A','A','A','A','A');
		initialList.addFirst('Y');
		
		assertTrue(initialList.toString().equals(expectedList.toString()));
	}
	
	@Test
	void TC26() {
		SingleLinkedListImpl<Character> initialList = new SingleLinkedListImpl<Character>('A','A','A','A','A');
		assertThrows(IllegalArgumentException.class, () -> {
			initialList.addFirst('@');
    	});
	}
	
	@Test
	void TC27() {
		SingleLinkedListImpl<Character> initialList = new SingleLinkedListImpl<Character>('A','A','A','A','A');
		assertThrows(IllegalArgumentException.class, () -> {
			initialList.addFirst('[');
    	});
	}
	
	@Test
	void TC28() {
		SingleLinkedListImpl<Character> initialList = new SingleLinkedListImpl<Character>('A','A','A','A','A');
		assertThrows(IllegalArgumentException.class, () -> {
			initialList.addFirst(null);
    	});
	}

}