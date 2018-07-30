package javacode.exercises.AthleteRunner;

public class AthleteRunner {

    private int speed = 0;
    private int shoeSize = 10;

    AthleteRunner(int speed, int shoeSize) {
        this.speed = speed;
        this.shoeSize = shoeSize;
    }

    AthleteRunner() {

        this(5,3);       // why does this work?
//        this(4)
        this.speed = 5;
        this.shoeSize = 3;
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
        athleteRunner.setSpeed(-10);
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
