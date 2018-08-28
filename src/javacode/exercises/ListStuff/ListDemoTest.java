package javacode.exercises.ListStuff;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ListDemoTest {


    @Test
    public void create_list_and_try_to_stream() {

        List<Integer> l1 = new ArrayList<Integer>();
        for (int i = 0;i<100;i++){ l1.add(i); }
        System.out.print(l1);
        l1.stream().map(j -> j + 1);
        l1.stream().map(number -> number * 3).forEach(System.out::println);
        System.out.print(l1);
    }

    @Test
    public void create_a_basic_list_and_return_stuff() {

        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(0, 1);  // adds 1 at 0 index
        l1.add(1, 2);  // adds 2 at 1 index
        System.out.println(l1);  // [1, 2]

        List<Integer> l2 = new ArrayList<>();
        List<Integer> l3 = new ArrayList<>();
        l2.add(1);
        l2.add(2);
        l2.add(3);

        // Will add list l2 from 1 index
        l1.addAll(1, l2);
        System.out.println(l1);

        // Removes element from index 1
        l1.remove(1);
        System.out.println(l1); // [1, 2, 3, 2]

        // Prints element at index 3
        System.out.println(l1.get(3));

        // Replace 0th element with 5
        l1.set(0, 5);
        System.out.println(l1);


    }

}