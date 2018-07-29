package javacode.exercises.JavaLearnings;

public class MultiplicationTable {

    public static void main(String[] args) {
        print();
        print(4);
        print(64,1,44);
    }

    public static void print() {
        print(5);
    }

    public static void print(int table) {
        print(table, 1, 10);
    }

    public static void print(int table, int from, int to) {
        for (int i = from; i <= to; i++) {
            System.out.printf("%d X %d = %d", table, i, table * i).println();
        }
    }
}