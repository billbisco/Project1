package javacode.exercises.fizzbuzz;

public class FizzBuzz {
    public String input(int inputNumber) {
        if(inputNumber % 15 == 0)
            return fizzbuzz();
        if(inputNumber % 3 == 0)
            return fizz();
        if(inputNumber % 5 == 0)
            return buzz();
        else
            return inputNumber(inputNumber);
    }

    public String fizzbuzz() {
        System.out.println("fizzbuzz");
        return "fizzbuzz";
    }

    public String fizz() {
        System.out.println("fizz");
        return "fizz";
    }

    public String buzz() {
        System.out.println("buzz");
        return "buzz";
    }

    public String inputNumber(Integer inputNumber) {
        System.out.println(inputNumber);
        return inputNumber.toString();
    }

}