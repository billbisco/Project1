package javacode.exercises.JavaLearnings;

public class StringsAreImmutable {

    public static void immutable(){
        String s1 = "java";
        s1.concat(" rules");
        System.out.println("s1 refers to "+s1);  // Yes, s1 still refers to "java"
        String s2 = s1.concat(" Strings are immutable");
        System.out.println("this is s2 and " + s2);
    }

    public static void main(String[] args) {
        StringsAreImmutable.immutable();
    }

}
