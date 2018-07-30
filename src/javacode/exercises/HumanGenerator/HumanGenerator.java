package javacode.exercises.HumanGenerator;
//import java.util.Random;
import java.security.SecureRandom;

public class HumanGenerator {

    public static Human generateRandomHuman() {
        Human human = new Human();

        human.myGender = getSecureRandomElementFromArray(human.gender);
        human.mySkinType = getSecureRandomElementFromArray(human.skinType);
        human.myHairColor = getSecureRandomElementFromArray(human.hairColor);
        System.out.println("My human's gender is: " + human.myGender);
        System.out.println("My human's skin type is: " + human.mySkinType);
        System.out.println("My human's hair color is: " + human.myHairColor);
        return human;
    }

    public static  void main(String[] args) {
        generateRandomHuman();
    }

    public static <T> T getSecureRandomElementFromArray(T[] list)
    {
        SecureRandom secureRandom = new SecureRandom();
        return list[secureRandom.nextInt(list.length)];

    }

}
