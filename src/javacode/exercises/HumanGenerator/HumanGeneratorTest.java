package javacode.exercises.HumanGenerator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HumanGeneratorTest {

    @Test
    public void humanGeneratorGenderShouldNotReturnNull() {
        HumanGenerator humanGenerator = new HumanGenerator();
        Assert.assertNotNull(humanGenerator.generateRandomHuman().myGender);
    }

    @Test
    public void humanGeneratorSkinTypeShouldNotReturnNull() {
        HumanGenerator humanGenerator = new HumanGenerator();
        Assert.assertNotNull(humanGenerator.generateRandomHuman().mySkinType);
    }

    @Test
    public void humanGeneratorHairColorShouldNotReturnNull() {
        HumanGenerator humanGenerator = new HumanGenerator();
        Assert.assertNotNull(humanGenerator.generateRandomHuman().myHairColor);
    }

}