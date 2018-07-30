package javacode.exercises.HumanGenerator;
//import java.util.Random;
import java.security.SecureRandom;

public class HumanGenerator {

    public void generateRandomHuman() {
        Human human = new Human();

        human.myGender = getSecureRandomElementFromArray(human.gender);
        human.myGender = getSecureRandomElementFromArray(human.skinType);
        human.myGender = getSecureRandomElementFromArray(human.hairColor);
        System.out.println("My human's gender is: " + human.myGender);
        System.out.println("My human's skin type is: " + human.mySkinType);
        System.out.println("My human's hair color is: " + human.myHairColor);
    }

    public  void main(String[] args) {
        generateRandomHuman();
    }

    public static <T> T getSecureRandomElementFromArray(T[] list)
    {
        SecureRandom secureRandom = new SecureRandom();
        return list[secureRandom.nextInt(list.length)];

    }

}
