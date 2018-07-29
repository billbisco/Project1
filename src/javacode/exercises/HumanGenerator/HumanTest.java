package javacode.exercises.HumanGenerator;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class HumanTest {

    @Test
    public void humanGenderShouldContainMale() {
//        Assert.assertThat(Human.setGender("Male").equals("Male");
        Human human = new Human();
        human.mygender = "Male";
        String Array[] = human.gender;
//            Assert.assertThat(Arrays.asList(Human.gender));
    }

    public static boolean useList(String[] arr, String targetValue) {
        return Arrays.asList(arr).contains(targetValue);
    }
}
