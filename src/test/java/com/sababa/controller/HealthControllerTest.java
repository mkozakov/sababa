package com.sababa.controller;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HealthControllerTest {

    private HealthController unitUnderTest;

    @Before
    public void setUp() {
        unitUnderTest = new HealthController();
    }

    @Test
    public void testGetStatus() {
        String expectedMessage = "I'm up and healthy in every way";
        assertEquals(expectedMessage, unitUnderTest.getStatus());
    }
}
