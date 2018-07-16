package javacode.exercises.test;

import javacode.exercises.main.FizzBuzz;
import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void whenFizzBuzzIsPassedAOneItReturnsOne() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("1", fizzBuzz.input(1));
    }

    @Test
    public void whenFizzBuzzIsPassedATwoItReturnsTwo() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("2", fizzBuzz.input(2));
    }

    @Test
    public void whenFizzBuzzIsPassedAThreeItReturnsFizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("fizz", fizzBuzz.input(3));
    }

    @Test
    public void whenFizzBuzzIsPassedAFiveItReturnsBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("buzz", fizzBuzz.input(5));
    }

    @Test
    public void whenFizzBuzzIsPassedAFixItReturnsFizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("fizz", fizzBuzz.input(6));
    }

    @Test
    public void whenFizzBuzzIsPassedATenItReturnsBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("buzz", fizzBuzz.input(10));
    }

    @Test
    public void whenFizzBuzzIsPassedAFifteenItReturnsFizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("fizzbuzz", fizzBuzz.input(15));
    }

    @Test
    public void whenFizzBuzzIsPassedAThirtyItReturnsFizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("fizzbuzz", fizzBuzz.input(30));
    }

    @Test
    public void whenFizzBuzzIsPassedAThiirtyOneItReturnsThirtyOne() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("31", fizzBuzz.input(31));
    }

}
