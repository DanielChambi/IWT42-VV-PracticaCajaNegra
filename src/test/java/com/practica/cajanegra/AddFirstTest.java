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
		initialList.addFirst('P');
	    assertEquals('P', initialList.getAtPos(1));
	}
	
	@Test
	void TC22() {
		SingleLinkedListImpl<Character> initialList = new SingleLinkedListImpl<Character>('A','A','A','A','A');
		initialList.addFirst('A');
	    assertEquals('A', initialList.getAtPos(1));
	    }
	    
	@Test
	void TC23() {
		SingleLinkedListImpl<Character> initialList = new SingleLinkedListImpl<Character>('A','A','A','A','A');
		initialList.addFirst('Z');
	    assertEquals('Z', initialList.getAtPos(1));
	}
	
	@Test
	void TC24() {
		SingleLinkedListImpl<Character> initialList = new SingleLinkedListImpl<Character>('A','A','A','A','A');
		initialList.addFirst('B');
	    assertEquals('B', initialList.getAtPos(1));
	}
	
	@Test
	void TC25() {
		SingleLinkedListImpl<Character> initialList = new SingleLinkedListImpl<Character>('A','A','A','A','A');
		initialList.addFirst('Y');
	    assertEquals('Y', initialList.getAtPos(1));
	}
	
	@Test
	void TC26() {
		SingleLinkedListImpl<Character> initialList = new SingleLinkedListImpl<Character>('A','A','A','A','A');
		initialList.addFirst('@');
	    assertEquals('A', initialList.getAtPos(1));
	}
	
	@Test
	void TC27() {
		SingleLinkedListImpl<Character> initialList = new SingleLinkedListImpl<Character>('A','A','A','A','A');
		initialList.addFirst(']');
	    assertEquals('A', initialList.getAtPos(1));
	}
	
	@Test
	void TC28() {
		SingleLinkedListImpl<Character> initialList = new SingleLinkedListImpl<Character>('A','A','A','A','A');
		initialList.addFirst(null);
	    assertEquals('A', initialList.getAtPos(1));
	}

}