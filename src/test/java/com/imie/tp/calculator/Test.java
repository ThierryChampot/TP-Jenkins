package com.imie.tp.calculator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;

import com.imie.tp.calculator.operation.AdditionOperation;

public class Test {

    private AdditionOperation addition;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
        this.addition = new AdditionOperation(3);
    }

    @After
    public void tearDown() throws Exception {
        this.addition = null;
    }

    @org.junit.Test
    public void testAddition() throws Exception {
        Assert.assertNotNull(this.addition);
    }
}
