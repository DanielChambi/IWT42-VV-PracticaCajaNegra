package com.practica.cajanegra;
import com.cajanegra.SingleLinkedListImpl;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

public class AddNTimesTest {
    @Test
    public void TC41() {
        SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ('A', 'A', 'A', 'A', 'A');

        assertThrows(IllegalArgumentException.class, () -> {
            initialList.addNTimes('@', 5);
        });
    }


    @Test
    public void TC42() {
        SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ('A', 'A', 'A', 'A', 'A');
        initialList.addNTimes('A', 5);

        SingleLinkedListImpl < Character > expectedList = new SingleLinkedListImpl < Character > ('A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A');

        assertTrue(initialList.toString().equals(expectedList.toString()));
    }

    @Test
    public void TC43() {
        SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ('A', 'A', 'A', 'A', 'A');
        initialList.addNTimes('B', 5);

        SingleLinkedListImpl < Character > expectedList = new SingleLinkedListImpl < Character > ('A', 'A', 'A', 'A', 'A', 'B', 'B', 'B', 'B', 'B');

        assertTrue(initialList.toString().equals(expectedList.toString()));
    }


    @Test
    public void TC44() {
        SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ('A', 'A', 'A', 'A', 'A');
        assertThrows(IllegalArgumentException.class, () -> {
            initialList.addNTimes('P', -1);
        });
    }


    @Test
    public void TC45() {
        SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ('A', 'A', 'A', 'A', 'A');
        initialList.addNTimes('P', 0);
        SingleLinkedListImpl < Character > expectedList = new SingleLinkedListImpl < Character > ('A', 'A', 'A', 'A', 'A');

        assertTrue(initialList.toString().equals(expectedList.toString()));

    }



    @Test
    public void TC46() {
        SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ('A', 'A', 'A', 'A', 'A');
        initialList.addNTimes('P', 1);

        SingleLinkedListImpl < Character > expectedList = new SingleLinkedListImpl < Character > ('A', 'A', 'A', 'A', 'A', 'P');
        assertTrue(initialList.toString().equals(expectedList.toString()));
    }



    @Test
    public void TC47() {
        SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ('A', 'A', 'A', 'A', 'A');
        initialList.addNTimes('P', 5);

        SingleLinkedListImpl < Character > expectedList = new SingleLinkedListImpl < Character > ('A', 'A', 'A', 'A', 'A', 'P', 'P', 'P', 'P', 'P');
        assertTrue(initialList.toString().equals(expectedList.toString()));
    }


    @Test
    public void TC48() {
        SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ('A', 'A', 'A', 'A', 'A');
        initialList.addNTimes('Y', 5);

        SingleLinkedListImpl < Character > expectedList = new SingleLinkedListImpl < Character > ('A', 'A', 'A', 'A', 'A', 'Y', 'Y', 'Y', 'Y', 'Y');
        assertTrue(initialList.toString().equals(expectedList.toString()));
    }


    @Test
    public void TC49() { //Check Test
        SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ('A', 'A', 'A', 'A', 'A');
        initialList.addNTimes('Z', 5);

        SingleLinkedListImpl < Character > expectedList = new SingleLinkedListImpl < Character > ('A', 'A', 'A', 'A', 'A', 'Z', 'Z', 'Z', 'Z', 'Z');
        assertTrue(initialList.toString().equals(expectedList.toString()));
    }



    @Test
    public void TC410() {
        SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ('A', 'A', 'A', 'A', 'A');
        assertThrows(IllegalArgumentException.class, () -> {
            initialList.addNTimes('[', 5);
        });
    }



    @Test
    public void TC411() {
        SingleLinkedListImpl < Character > initialList = new SingleLinkedListImpl < Character > ('A', 'A', 'A', 'A', 'A');
        assertThrows(IllegalArgumentException.class, () -> {
            initialList.addNTimes(null, 5);
        });
    }


}