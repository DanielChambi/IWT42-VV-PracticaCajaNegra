package com.practica.cajanegra;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.cajanegra.SingleLinkedListImpl;

public class ReverseTest {
	@Test
    public void TC111() {
        SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ();
        SingleLinkedListImpl < Character > expectedList = new SingleLinkedListImpl < Character > ();

        assertTrue(initialList.reverse().toString().equals(expectedList.toString()));
    }
	
	@Test
    public void TC112() {
        SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ('A');
        SingleLinkedListImpl < Character > expectedList = new SingleLinkedListImpl < Character > ('A');

        assertTrue(initialList.reverse().toString().equals(expectedList.toString()));
    }
	
	@Test
    public void TC113() {
        SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ('A', 'A', 'A');
        SingleLinkedListImpl < Character > expectedList = new SingleLinkedListImpl < Character > ('A', 'A', 'A');

        assertTrue(initialList.reverse().toString().equals(expectedList.toString()));
    }
	
	@Test
    public void TC114() {
        SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ('A', 'B', 'C');
        SingleLinkedListImpl < Character > expectedList = new SingleLinkedListImpl < Character > ('C', 'B', 'A');

        assertTrue(initialList.reverse().toString().equals(expectedList.toString()));
    }
}
