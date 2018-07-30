package javacode.exercises.HumanGenerator;

import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;


public class HumanGeneratorTest {

    @Test
    public void humanGeneratorAttributesShouldNotReturnNull() {
        HumanGenerator humanGenerator = new HumanGenerator();
        Assert.assertNotNull(humanGenerator.generateRandomHuman().myGender);
        Assert.assertNotNull(humanGenerator.generateRandomHuman().mySkinType);
        Assert.assertNotNull(humanGenerator.generateRandomHuman().myHairColor);
    }

    @Test
    public void humanGeneratorHairColorShouldNotReturnInvalidValues() {
        Human human = new Human();
        HumanGenerator humanGenerator = new HumanGenerator();
        Assert.assertFalse(Arrays.asList(human.gender).contains(humanGenerator.generateRandomHuman().mySkinType));
        Assert.assertFalse(Arrays.asList(human.gender).contains(humanGenerator.generateRandomHuman().myHairColor));
    }

}