package javacode.test;

import javacode.main.FizzBuzz;
import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void whenFizzBuzzIsPassedANumberItReturnsThatNumber() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("1", fizzBuzz.fizz(1));

    }

}
