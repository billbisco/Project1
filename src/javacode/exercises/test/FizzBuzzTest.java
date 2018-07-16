package javacode.exercises.test;

import javacode.exercises.main.FizzBuzz;
import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void whenFizzBuzzIsPassedAOneItReturnsOne() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("1", fizzBuzz.fizz(1));

    }

}
