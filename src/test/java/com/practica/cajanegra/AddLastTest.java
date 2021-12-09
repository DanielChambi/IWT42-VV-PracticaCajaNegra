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


public class AddLastTest {
	
	@Test
	void TC31() {
		SingleLinkedListImpl<Character> initialList = new SingleLinkedListImpl<Character>('A','A','A','A','A');
		SingleLinkedListImpl < Character > expectedList = new SingleLinkedListImpl < Character > ('A','A','A','A','A','P');
		initialList.addLast('P');
		
		assertTrue(initialList.toString().equals(expectedList.toString()));
	}
	
	@Test
	void TC32() {
		SingleLinkedListImpl<Character> initialList = new SingleLinkedListImpl<Character>('A','A','A','A','A');
		SingleLinkedListImpl < Character > expectedList = new SingleLinkedListImpl < Character > ('A','A','A','A','A','A');
		initialList.addLast('A');
		
		assertTrue(initialList.toString().equals(expectedList.toString()));
	}
	    
	@Test
	void TC33() {
		SingleLinkedListImpl<Character> initialList = new SingleLinkedListImpl<Character>('A','A','A','A','A');
		SingleLinkedListImpl < Character > expectedList = new SingleLinkedListImpl < Character > ('A','A','A','A','A','Z');
		initialList.addLast('Z');
		
		assertTrue(initialList.toString().equals(expectedList.toString()));
	}
	
	@Test
	void TC34() {
		SingleLinkedListImpl<Character> initialList = new SingleLinkedListImpl<Character>('A','A','A','A','A');
		SingleLinkedListImpl < Character > expectedList = new SingleLinkedListImpl < Character > ('A','A','A','A','A','B');
		initialList.addLast('B');
		
		assertTrue(initialList.toString().equals(expectedList.toString()));
	}
	
	@Test
	void TC35() {
		SingleLinkedListImpl<Character> initialList = new SingleLinkedListImpl<Character>('A','A','A','A','A');
		SingleLinkedListImpl < Character > expectedList = new SingleLinkedListImpl < Character > ('A','A','A','A','A','Y');
		initialList.addLast('Y');
		
		assertTrue(initialList.toString().equals(expectedList.toString()));
	}
	
	@Test
	void TC36() {
		SingleLinkedListImpl<Character> initialList = new SingleLinkedListImpl<Character>('A','A','A','A','A');
		initialList.addLast('@');
	    assertEquals('A', initialList.getAtPos(initialList.size()));
	}
	
	@Test
	void TC37() {
		SingleLinkedListImpl<Character> initialList = new SingleLinkedListImpl<Character>('A','A','A','A','A');
		initialList.addLast(']');
	    assertEquals('A', initialList.getAtPos(initialList.size()));
	}
	
	@Test
	void TC38() {
		SingleLinkedListImpl<Character> initialList = new SingleLinkedListImpl<Character>('A','A','A','A','A');
		initialList.addLast(null);
	    assertEquals('A', initialList.getAtPos(initialList.size()));
	}

}