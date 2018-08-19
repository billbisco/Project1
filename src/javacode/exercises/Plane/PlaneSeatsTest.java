package javacode.exercises.Plane;

import org.junit.Assert;
import org.junit.Test;

public class PlaneSeatsTest {


    @Test
    public void array_of_twelve_planeseats_should_return_12() {
        Plane plane = new Plane();
        plane.setSeats(12);
        Assert.assertEquals(plane.getSeats(),12);
    }

}