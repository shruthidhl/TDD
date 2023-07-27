package com.qa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

private Account act;

    @BeforeEach
    void setUp() {
         act = new Account(new String[]{"Link","Visa"},
                     "10-10-22","11223344","1234");
    }


    @Test
    void getCardTypes() {
    }

    @Test
    void setCardTypes() {
    }



    @Test
    void getSortcode() {
    }

    @Test
    void setSortcode() {
    }

    @Test
    void getAcccountNumber() {
    }

    @Test
    void setAcccountNumber() {
    }

    @Test
    void getPassword() {
    }

    @Test
    void setPassword() {
    }

    @Test
    void testToString() {
    }

    @Test
    void testcompareTo() {

        Account inputObject = new Account(new String[]{"Link"},
        "10-10-22","11223344","1234");


        assertEquals(0, act.compareTo(inputObject), "Login Failed");
    }
}