package javacode.exercises.Plane;

public class Plane {

    private int seats;

    public void setSeats(int input) {
        this.seats = input;
    };

    public int getSeats() {
        return this.seats;
    }


    public static void main(String[] args) {
        totalPlaneSeats();
    }

    public static void totalPlaneSeats() {
        int PlaneSeats[] = { 1,2,3,4,5,6,7,8,9,10,11,12};

        System.out.println(PlaneSeats);
    }

}
