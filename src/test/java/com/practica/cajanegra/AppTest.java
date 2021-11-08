package com.practica.cajanegra;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;

import com.cajanegra.*;

public class AppTest {
	
	com.cajanegra.AbstractSingleLinkedListImpl<Character> singleList = 
			new com.cajanegra.SingleLinkedListImpl(new Character[] {'A', 'B', 'C', 'D', 'E'});
	
	@Test
	public void testGetAtPos() {
		assertEquals(singleList.getAtPos(1), 'A');
		assertEquals(singleList.getAtPos(5), 'E');
		assertEquals(singleList.getAtPos(2), 'B');
		assertEquals(singleList.getAtPos(3), 'C');
		assertEquals(singleList.getAtPos(4), 'D');
		assertEquals(singleList.getAtPos(1), 'H');
		assertEquals(singleList.getAtPos(5), 'P');
	}
  
}
  