package javacode;

import javacode.exercises.JavaLearnings.PrintF;
import javacode.exercises.fizzbuzz.FizzBuzz;

public class Main {
    public static void main(String[] args) {
        // Prints "Hello, World" in the terminal window.
        System.out.println("Hello, World");
        currentTimePrintOut();
        runFizzBuzz();
        PrintF.printing();
    }

    public static void currentTimePrintOut() {
//        System.out.println("This is the Current Time" + System.currentTimeMillis());
        System.out.println("This is the Current Date and Time " + new java.util.Date());
    }

    public static void runFizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        for (int i = 1; i <= 100; i++) {
            fizzBuzz.input(i);
        }
    }



}


