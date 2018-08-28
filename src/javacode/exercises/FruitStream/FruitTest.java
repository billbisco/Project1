package javacode.exercises.FruitStream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.awt.*;
import java.util.*;

public class FruitTest {

    @Test
    public void fruit_map_stream_test() {

        Fruit apple = new Fruit();

        List<Integer> fruits = new ArrayList<Integer>();
        Collections.addAll(fruits, 1, 2, 3, 4, 5);
        System.out.println(fruits);

//        fruits.forEach(fruit -> fruit.setName(fruit.getName() + "s"));

//        List<Fruit> newList = fruits.stream()
//                .map(f -> new Fruit() )
//                        .collect(Collectors.toList());
//    }

//    apple.setName("banana");

    }
}