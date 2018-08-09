package javacode.exercises.JavaLearnings;

import java.security.SecureRandom;

public class WhatisToday {

    public static void main(String[] args) {
        WhatisToday question = new WhatisToday();
        question.conversationResponses(1);
        question.conversationResponses(43);
    }

    public void conversationOptions() {
        String politeGreeting = "Hello, I'm so happy to meet you";
        String neutralGreeting = "Hello";
        String negativeGreeting = "What do you want?";
    }

    public void conversationResponses(int conversationOption) {
        String politeGreeting = "Hello, I'm so happy to meet you";

        switch (conversationOption) {
            case 1:
                System.out.println("You picked 1!  Booyah!");
                break;
            case 2:
                System.out.println("You picked 2!  Radical!");
                break;
            default:
                System.out.println("You picked something else!  Boring!");
                break;
        }
    }


}
