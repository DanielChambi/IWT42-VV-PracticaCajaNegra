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



public class AddAtPosTest {
    @Test
    void TC11() {
        SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ('A', 'A', 'A', 'A', 'A');
        assertThrows(IllegalArgumentException.class, () -> {
            initialList.addAtPos('@', 6);
        });
    }
    
    @Test
    void TC12() {
        SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ('A', 'A', 'A', 'A', 'A');
        SingleLinkedListImpl < Character > expectedList = new SingleLinkedListImpl < Character > ('A', 'A', 'A', 'A', 'A', 'A');
        initialList.addAtPos('A', 6);

        assertTrue(initialList.toString().equals(expectedList.toString()));
    }


    @Test
    void TC13() {
        SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ('A', 'A', 'A', 'A', 'A');
        SingleLinkedListImpl < Character > expectedList = new SingleLinkedListImpl < Character > ('A', 'A', 'A', 'A', 'A', 'B');
        initialList.addAtPos('B', 6);

        assertTrue(initialList.toString().equals(expectedList.toString()));
    }

    @Test
    void TC14() {
        SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ('A', 'A', 'A', 'A', 'A');
        assertThrows(IllegalArgumentException.class, () -> {
            initialList.addAtPos('P', 0);
        });
    }
    
    @Test
    void TC15() {
        SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ('A', 'A', 'A', 'A', 'A');
        SingleLinkedListImpl < Character > expectedList = new SingleLinkedListImpl < Character > ('P', 'A', 'A', 'A', 'A', 'A');
        initialList.addAtPos('P', 1);


        assertTrue(initialList.toString().equals(expectedList.toString()));
    }

    @Test
    void TC16() {
        SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ('A', 'A', 'A', 'A', 'A');
        SingleLinkedListImpl < Character > expectedList = new SingleLinkedListImpl < Character > ('A', 'P', 'A', 'A', 'A', 'A');
        initialList.addAtPos('P', 2);

        assertTrue(initialList.toString().equals(expectedList.toString()));
    }

    @Test
    void TC17() {
        SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ('A', 'A', 'A', 'A', 'A');
        SingleLinkedListImpl < Character > expectedList = new SingleLinkedListImpl < Character > ('A', 'A', 'A', 'A', 'A', 'P');
        initialList.addAtPos('P', 6);

        assertTrue(initialList.toString().equals(expectedList.toString()));
    }
    
    @Test
    void TC18() {
        SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ('A', 'A', 'A', 'A', 'A');
        SingleLinkedListImpl < Character > expectedList = new SingleLinkedListImpl < Character > ('A', 'A', 'A', 'A', 'A', 'Y');
        initialList.addAtPos('Y', 6);

        assertTrue(initialList.toString().equals(expectedList.toString()));
    }

    @Test
    void TC19() {
        SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ('A', 'A', 'A', 'A', 'A');
        SingleLinkedListImpl < Character > expectedList = new SingleLinkedListImpl < Character > ('A', 'A', 'A', 'A', 'A', 'Z');
        initialList.addAtPos('Z', 6);
        
        assertTrue(initialList.toString().equals(expectedList.toString()));
    }

    @Test
    void TC110() {
        SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ('A', 'A', 'A', 'A', 'A');
        assertThrows(IllegalArgumentException.class, () -> {
	    	initialList.addAtPos('[',5);
	    });
    }

    @Test
    void TC111() {
        SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ('A', 'A', 'A', 'A', 'A');
        Character
        var = null;
        assertThrows(IllegalArgumentException.class, () -> {
    		initialList.addAtPos(var,5);
    	});
    } 
}