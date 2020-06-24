package com.oc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    public void test () {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.FBuzz(4);
        assertEquals("4",result);

    }
    @Test
    public void test1 () {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.FBuzz(3);
        assertEquals("fizz",result);

    }
    @Test
    public void test2 () {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.FBuzz(5);
        assertEquals("buzz",result);

    }
    @Test
    public void test3 () {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.FBuzz(15);
        assertEquals("fizzBuzz",result);

    }
    @Test
    public void test4 () {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.FBuzz(20);
        assertEquals("buzz",result);

    }

}