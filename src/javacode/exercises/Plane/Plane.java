package javacode.exercises.Plane;

public class Plane {

    public static int planeCounter;
    private int seats;

    public Plane(){
        planeCounter++;
    }

    public static void genericPlaneMaker(int x) {

        Plane[] planes = new Plane[x];
        for (x = 0; x < planes.length; x++){
            planes[x] = new Plane();
      }

    }

    public int getPlaneCounter(){
        return planeCounter;
    }

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
