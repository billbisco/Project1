package javacode.exercises.HumanGenerator;

import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

public class HumanTest {

    @Test
    public void humanGenderShouldContainMale() {
        Human human = new Human();
        human.myGender = "Male";
        List<String> list = Arrays.asList(human.gender);
        Assert.assertTrue(Arrays.asList(human.gender).contains(human.myGender));
    }

    @Test
    public void humanHairShouldContainBrown() {
        Human human = new Human();
        human.myHairColor = "Brown";
        Assert.assertTrue(Arrays.asList(human.hairColor).contains(human.myHairColor));
    }

    @Test
    public void humanSkinShouldContainDusky() {
        Human human = new Human();
        human.mySkinType = "Dusky";
        Assert.assertTrue(Arrays.asList(human.skinType).contains(human.mySkinType));
    }


}
