package com.practica.cajanegra;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import com.cajanegra.*;

public class RemoveFromListTest {
	//removeLast without parameters
	@Test
    public void TC91() throws EmptyCollectionException {
        SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ('A');
        initialList.removeLast();
        SingleLinkedListImpl < Character > expectedList = new SingleLinkedListImpl < Character > ();

        assertTrue(initialList.toString().equals(expectedList.toString()));
    }
	
	@Test
    public void TC92() throws EmptyCollectionException {
        SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ('A', 'B');
        initialList.removeLast();
        SingleLinkedListImpl < Character > expectedList = new SingleLinkedListImpl < Character > ('A');

        assertTrue(initialList.toString().equals(expectedList.toString()));
    }
	
	@Test
    public void TC93() throws EmptyCollectionException {
        SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ('A', 'B', 'C', 'D', 'E', 'F');
        initialList.removeLast();
        SingleLinkedListImpl < Character > expectedList = new SingleLinkedListImpl < Character > ('A', 'B', 'C', 'D', 'E');

        assertTrue(initialList.toString().equals(expectedList.toString()));
    }
	
	@Test
    public void TC94() {
        SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ();

        assertThrows(EmptyCollectionException.class, () -> {
            initialList.removeLast();
        });
    }
	
	//removeLast with parameters
	@Test
    public void TC101() {
        SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ();

        assertThrows(EmptyCollectionException.class, () -> {
            initialList.removeLast('P');
        });
    }
	
	@Test
    public void TC102() {
        SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ();

        assertThrows(EmptyCollectionException.class, () -> {
            initialList.removeLast('A');
        });
    }
	
	@Test
    public void TC103() {
        SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ();

        assertThrows(EmptyCollectionException.class, () -> {
            initialList.removeLast('Z');
        });
    }
	
	@Test
    public void TC104() {
        SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ();

        assertThrows(EmptyCollectionException.class, () -> {
            initialList.removeLast('[');
        });
    }
	
	@Test
    public void TC105() {
        SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ();

        assertThrows(EmptyCollectionException.class, () -> {
            initialList.removeLast('@');
        });
    }
	
	@Test
    public void TC106() throws EmptyCollectionException {
        SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ('P','A','Z','B','Y','P','A','Z','B','Y');
        initialList.removeLast('P');
        SingleLinkedListImpl < Character > expectedList = new SingleLinkedListImpl < Character > ('P','A','Z','B','Y','A','Z','B','Y');

        assertTrue(initialList.toString().equals(expectedList.toString()));
    }
	
	@Test
    public void TC107() throws EmptyCollectionException {
        SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ('P','A','Z','B','Y','P','A','Z','B','Y');
        initialList.removeLast('A');
        SingleLinkedListImpl < Character > expectedList = new SingleLinkedListImpl < Character > ('P','A','Z','B','Y','P','Z','B','Y');

        assertTrue(initialList.toString().equals(expectedList.toString()));
    }
	
	@Test
    public void TC108() throws EmptyCollectionException {
        SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ('P','A','Z','B','Y','P','A','Z','B','Y');
        initialList.removeLast('Z');
        SingleLinkedListImpl < Character > expectedList = new SingleLinkedListImpl < Character > ('P','A','Z','B','Y','P','A','B','Y');

        assertTrue(initialList.toString().equals(expectedList.toString()));
    }
	
	@Test
    public void TC109() throws EmptyCollectionException {
        SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ('P','A','Z','B','Y','P','A','Z','B','Y');
        initialList.removeLast('B');
        SingleLinkedListImpl < Character > expectedList = new SingleLinkedListImpl < Character > ('P','A','Z','B','Y','P','A','Z','Y');

        assertTrue(initialList.toString().equals(expectedList.toString()));
    }
	
	@Test
    public void TC1010() throws EmptyCollectionException {
        SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ('P','A','Z','B','Y','P','A','Z','B','Y');
        initialList.removeLast('Y');
        SingleLinkedListImpl < Character > expectedList = new SingleLinkedListImpl < Character > ('P','A','Z','B','Y','P','A','Z','B');

        assertTrue(initialList.toString().equals(expectedList.toString()));
    }
	
	@Test
    public void TC1011() {
        SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ('N');

        assertThrows(NoSuchElementException.class, () -> {
            initialList.removeLast('P');
        });
    }
	
	@Test
    public void TC1012() {
        SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ('N');

        assertThrows(NoSuchElementException.class, () -> {
            initialList.removeLast('A');
        });
    }
	
	@Test
    public void TC1013() {
        SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ('N');

        assertThrows(NoSuchElementException.class, () -> {
            initialList.removeLast('Z');
        });
    }
	
	@Test
    public void TC1014() {
        SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ('N');

        assertThrows(NoSuchElementException.class, () -> {
            initialList.removeLast('B');
        });
    }
	
	@Test
    public void TC1015() {
        SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ('N');

        assertThrows(NoSuchElementException.class, () -> {
            initialList.removeLast('Y');
        });
    }
	
	@Test
    public void TC1016() {
        SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ('N');

        assertThrows(IllegalArgumentException.class, () -> {
            initialList.removeLast('@');
        });
    }
	
	@Test
    public void TC1017() {
        SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ('N');

        assertThrows(IllegalArgumentException.class, () -> {
            initialList.removeLast('[');
        });
    }
	
	@Test
    public void TC1018() {
        SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ('N');

        assertThrows(IllegalArgumentException.class, () -> {
            initialList.removeLast(null);
        });
    }
}