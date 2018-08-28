package javacode.exercises.Plane;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlaneTest {

    @Test
    public void array_of_twelve_planeseats_should_return_12() {
        Plane plane = new Plane();
        plane.setSeats(12);
        Assert.assertEquals(plane.getSeats(),12);
        }

        @Test
        public void six_instances_of_plane_should_return_planeCounter_of_six(){
            Plane plane1 = new Plane();
            Plane plane2 = new Plane();
            Plane plane3 = new Plane();
            Plane plane4 = new Plane();
            Plane plane5 = new Plane();
            Plane plane6 = new Plane();
            Assert.assertEquals(Plane.planeCounter,6);
        }
        
        @Test
        public void one_hundreed_instances_should_return_one_hundred_planeCounter(){

        Plane.genericPlaneMaker(100);
        System.out.println("Planecounter is " + Plane.planeCounter);
        Assert.assertEquals(Plane.planeCounter,100);
        }

        @Test
        public void thirteen_instances_return_thirteen() {

            Plane[] planes = new Plane[13];
            for (int i = 0; i < planes.length; i++) {
                planes[i] = new Plane();
            }

            Assert.assertEquals(Plane.planeCounter,13);
        }

        @Test
        public void create_planes_inside_of_braces() {


        }


    }