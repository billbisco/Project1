package javacode.exercises.JavaLearnings;

public class PrintF {
    public static void main(String[] args) {
        Double dblTotal = 33.2;
        System.out.printf("Total is: $%,.2f %n", dblTotal);
        System.out.print("Total is: $%,.2f %n" + dblTotal);
    }
}
