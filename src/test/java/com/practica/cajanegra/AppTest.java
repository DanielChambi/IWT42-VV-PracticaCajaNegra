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
	

	@ParameterizedTest
	@CsvSource(value = {
			"ABC, AB, 1",
			"ABC, BC, 2",
			"DEF, AB, -1",
			"ABC, '', 0",
			"ABC, NIL, 0"
	}, nullValues = "NIL")
	public void testIsSublist(String stringList, String stringSublist, int res) {
		com.cajanegra.AbstractSingleLinkedListImpl<Character> list = stringToList(stringList);
		com.cajanegra.AbstractSingleLinkedListImpl<Character> sublist = stringToList(stringSublist);
		
		assertEquals(res, list.isSubList(sublist));		
	}
	
	
	@ParameterizedTest
	@CsvSource({"''", "A", "AAA", "ABC"})
	public void testReverse(String input) {
		com.cajanegra.AbstractSingleLinkedListImpl<Character> list = 
				new com.cajanegra.SingleLinkedListImpl(new Character[] {});
		
		list = stringToList(input);
		
		list = list.reverse();
		
		int n = input.length();
		for(int i = 0; i < n; i++) {
			assertEquals(input.charAt( input.length() - i - 1 ), list.getAtPos(i + 1));
		}
		
	}
	
	private com.cajanegra.AbstractSingleLinkedListImpl<Character> stringToList(String input){
		if(input == null) return null;
		
		com.cajanegra.AbstractSingleLinkedListImpl<Character> list = 
				new com.cajanegra.SingleLinkedListImpl(new Character[] {});
		
		int n = input.length();
		for(int i = 0; i < n; i++) {
			list.addLast(input.charAt(i));
		}
		
		return list;
	}
  
}
  