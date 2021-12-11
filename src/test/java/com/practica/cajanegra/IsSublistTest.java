package com.practica.cajanegra;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;

import com.cajanegra.*;

public class IsSublistTest {
	@Test
    public void TC81() {
        SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ('A', 'B', 'C');
        SingleLinkedListImpl < Character > subList = new SingleLinkedListImpl < Character > ('A', 'B');

        assertEquals(initialList.isSubList(subList), 1);
    }
	
	@Test
    public void TC82() {
        SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ('A', 'B', 'C');
        SingleLinkedListImpl < Character > subList = new SingleLinkedListImpl < Character > ('B', 'C');

        assertEquals(initialList.isSubList(subList), 2);
    }
	
	@Test
    public void TC83() {
        SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ('D', 'E', 'F');
        SingleLinkedListImpl < Character > subList = new SingleLinkedListImpl < Character > ('A', 'B');

        assertEquals(initialList.isSubList(subList), -1);
    }
	
	@Test
    public void TC84() {
        SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ('A', 'B', 'C');
        SingleLinkedListImpl < Character > subList = new SingleLinkedListImpl < Character > ();

        assertEquals(initialList.isSubList(subList), 0);
    }
	
	@Test
	public void TC85() {
        SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ('A', 'B', 'C');
        SingleLinkedListImpl < Character > subList = null;
		assertThrows(IllegalArgumentException.class, () -> {
			initialList.isSubList(subList);
		});
	}
}
  
