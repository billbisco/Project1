package javacode.exercises.AthleteRunner;

public class AthleteRunner {

    private int speed = 0;
    private int shoeSize = 10;

    AthleteRunner(int speed, int shoeSize) {
        this.speed = speed;
        this.shoeSize = shoeSize;
    }

    AthleteRunner() {
        this(5,3);
    }

    public void helpfulRunner() {
        this.shoeSize = 0;
        this.speed = 4;
    }

    public void helpfulRunner(int speed, int shoeSize) {
        this.speed = speed;
        this.shoeSize = shoeSize;
    }

    public void helpfulRunner2(int speed, int shoeSize) {
        this(4,3); // how can I get this to work?
    }


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if(speed < 0) {
            this.speed = speed / 2;
        }
        else if(speed > 0 & speed < 10) {
            this.speed = speed + 1;
        }
        else {
            this.speed = speed;
        }
        System.out.println(this.speed);
    }

    public static void main(String[] args) {
        AthleteRunner athleteRunner = new AthleteRunner();
        System.out.println("Shoe Size: " + athleteRunner.shoeSize + " Speed: " + athleteRunner.speed);
        athleteRunner.setSpeed(-10);
        AthleteRunner athleteRunner2 = new AthleteRunner(8,9);
        System.out.println("Shoe Size: " + athleteRunner2.shoeSize + " Speed: " + athleteRunner2.speed);
        athleteRunner.setSpeed(-9);
        athleteRunner.setSpeed(-4);
        athleteRunner.setSpeed(0);
        athleteRunner.setSpeed(1);
        athleteRunner.setSpeed(3);
        athleteRunner.setSpeed(7);
        athleteRunner.setSpeed(10);
        athleteRunner.setSpeed(15);
    }

}
