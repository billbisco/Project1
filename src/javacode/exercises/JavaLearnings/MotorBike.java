package javacode.exercises.JavaLearnings;

public class MotorBike {
	//state
	private int speed; //member variable
	

	//constructors
	MotorBike() {
		this(5);
	}
	
	MotorBike(int speed) {
		this.speed = speed;
		double modifiedSpeed = speed *1.5;
	}
	
	//behavior
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if(speed > 0 )
			this.speed = speed;
	}

	public void increaseSpeed(int howMuch) {
		setSpeed(this.speed + howMuch);
	}

	public void decreaseSpeed(int howMuch) {
		setSpeed(this.speed - howMuch);
	}
	
	void start() {
		System.out.println("Bike Started");
	}
}
