package com.practica.cajanegra;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.cajanegra.SingleLinkedListImpl;

public class ReverseTest {
	@ParameterizedTest
	@CsvSource({"''", "A", "AAA", "ABC"})
	public void testReverse(String input) {
		com.cajanegra.AbstractSingleLinkedListImpl<Character> list = 
				new com.cajanegra.SingleLinkedListImpl(new Character[] {});
		
		list = stringToList(input);
		
		list = list.reverse();
		
		int n = input.length();
		for(int i = 0; i < n; i++) {
			assertEquals((Character) input.charAt( input.length() - i - 1 ), list.getAtPos(i + 1));
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
	/*@Test
    public void TC111() {
        SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ();
        initialList.reverse();
        SingleLinkedListImpl < Character > expectedList = new SingleLinkedListImpl < Character > ();

        assertTrue(initialList.toString().equals(expectedList.toString()));
    }
	
	@Test
    public void TC112() {
        SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ('A');
        initialList.reverse();
        SingleLinkedListImpl < Character > expectedList = new SingleLinkedListImpl < Character > ('A');

        assertTrue(initialList.toString().equals(expectedList.toString()));
    }
	
	@Test
    public void TC113() {
        SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ('A', 'A', 'A');
        initialList.reverse();
        SingleLinkedListImpl < Character > expectedList = new SingleLinkedListImpl < Character > ('A', 'A', 'A');

        assertTrue(initialList.toString().equals(expectedList.toString()));
    }
	
	@Test
    public void TC114() {
        SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ('A', 'B', 'C');
        initialList.reverse();
        SingleLinkedListImpl < Character > expectedList = new SingleLinkedListImpl < Character > ('C', 'B', 'A');

        assertTrue(initialList.toString().equals(expectedList.toString()));
    }*/
}
