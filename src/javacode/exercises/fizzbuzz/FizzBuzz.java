package javacode.exercises.fizzbuzz;

public class FizzBuzz {
    public String input(Integer inputNum) {
        String value;
        if(inputNum % 15 == 0)
            return fizzbuzz();
        if(inputNum % 3 == 0)
            return fizz();
        if(inputNum % 5 == 0)
            return buzz();
        else
            return inputNumber(inputNum);
    }
    public String fizzbuzz() {
        System.out.println("fizzbuzz");
        return "fizzbuzz";
    }

    public String fizz() {
        String fizz = "fizz";
        System.out.println(fizz);
        return fizz;
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