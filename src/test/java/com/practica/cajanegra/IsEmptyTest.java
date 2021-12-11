package com.practica.cajanegra;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.cajanegra.SingleLinkedListImpl;

public class IsEmptyTest {
    @Test
    void TC71() {
        SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ();
        
        assertTrue(initialList.isEmpty());
    }


    @Test
    void TC72() {
        SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ('A');
        
        assertFalse(initialList.isEmpty());
    }
}