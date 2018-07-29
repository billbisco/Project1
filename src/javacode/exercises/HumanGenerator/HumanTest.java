package javacode.exercises.HumanGenerator;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class HumanTest {

    @Test
    public void humanGenderShouldContainMale() {
//        Assert.assertThat(Human.setGender("Male").equals("Male");
        Human human = new Human();
        human.mygender = "Male";
        List<String> list = Arrays.asList(human.gender);
        Assert.assertTrue(listContainsTargetValue(human.gender,human.mygender));
        System.out.println(listContainsTargetValue(human.gender,human.mygender));

    }

    public static boolean listContainsTargetValue(String[] arr, String targetValue) {
        return Arrays.asList(arr).contains(targetValue);
    }

}
