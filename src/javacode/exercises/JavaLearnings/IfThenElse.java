package javacode.exercises.JavaLearnings;

public class IfThenElse {

    public void IfThen() {
        int number = 10;
        int number2 = 20;
        int number3 = 35;

        if(number>19) {
            System.out.println("Number is greater than 19");
        }
        if(number<9) {
            System.out.println("Number is less than 9");
        }

        if(number>15 && number<18) {
            System.out.println("Number is less than 15 or greater than 18");
        }
        else {
            System.out.println("Number is between 15 and 18");
        }

        if(number < 5) {
            System.out.println("Condition is satisified");
        }
        else if(number2 < 20) {
            System.out.println("Second condition is satisfied");
        }
        else if(number3 < 35) {
            System.out.println("Third condition is satisfied");
        }
        else {
            System.out.println("Not condition is satisfied");
        }

    }

        private static void puzzle3() {
            int m = 21;

            if(m>20)
                if(m<20)
                    System.out.println("m>20");
                else
                    System.out.println("Who am I?");
        }

    private static void puzzle4() {
        int m = 21;

        if(m>20) {
            if(m<20)
                System.out.println("m>20");
            else
                System.out.println("Who am I?");
        }

    }

    private static void puzzle5() {
        int m = 33;

        if(m>20)
            if(m>30)
                if(m>40)
                    if(m>50)
                        if(m<60)
                            System.out.println("m<60");
                        else
                            System.out.println("m>60");
    }

        public static void main(String[] args) {
            puzzle3();
            puzzle4();
            puzzle5();
        }

    }
