package javacode.exercises.JavaLearnings;

import java.util.Arrays;
import java.util.List;

public class StringArrays {

    public static void main(String[] args) {

        String[] alphabet = new String[]{"A", "B", "C"};

        // Convert String Array to List
        List<String> list = Arrays.asList(alphabet);

        if(list.contains("C")){
            System.out.println("Hello C");
        }

    }

}
