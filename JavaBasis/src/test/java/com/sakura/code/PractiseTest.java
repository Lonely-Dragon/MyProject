package com.sakura.code;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
public class PractiseTest {

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void getFirstChar() {
        Practise practise = new Practise();
        String s = "test";
        String a = Practise.getFirstChar(s);
        Assert.assertEquals("a", a);
    }

    @Test
    public void main() {
    }

    @Test
    public void add() {
        PowerMockito.spy(Practise.class);
        Practise practise = new Practise();
        int one = practise.add(1, 2);

        Assert.assertEquals(3, one);
    }
}