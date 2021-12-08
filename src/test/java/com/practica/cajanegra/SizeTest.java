package com.practica.cajanegra;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.cajanegra.SingleLinkedListImpl;

public class SizeTest {
     @Test
       public void TC121(){
           SingleLinkedListImpl<String> initialList = new SingleLinkedListImpl<String> ();

           assertEquals(0,initialList.size());
       }


       @Test
       public void TC122(){
           SingleLinkedListImpl<String> initialList = new SingleLinkedListImpl<String> ("A","B","C");

           assertEquals(3,initialList.size());
       }

}