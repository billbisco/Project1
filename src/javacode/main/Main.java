package javacode.main;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Prints "Hello, World" in the terminal window.
        System.out.println("Hello, World");
        currentTimePrintOut();
    }

    public static void currentTimePrintOut() {
//        System.out.println("This is the Current Time" + System.currentTimeMillis());
        System.out.println("This is the Current Date " + new java.util.Date());
    }




}


