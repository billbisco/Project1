package javacode.exercises.ArrayStuff;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
				
		Student Jimmy = new Student("Jimmy", 97, 98, 100);
		Student Timmy = new Student("Timmy",22,33,44,55,66,77,88,99);

		int number = Jimmy.getNumberOfMarks();
		System.out.println("number of marks : " + number);
		
		int sum = Jimmy.getTotalSumOfMarks();
		System.out.println("sum of marks : " + sum);
		
		int maximumMark = Jimmy.getMaximumMark();
		System.out.println("maximum of marks : " + maximumMark);
		
		int minimumMark = Jimmy.getMinimumMark();
		System.out.println("minimum of marks : " + minimumMark);
		
		BigDecimal average = Jimmy.getAverageMarks();
		System.out.println("average : " + average);
		
		System.out.println(Jimmy);
		
		Jimmy.addNewMark(35);
		
		System.out.println(Jimmy);

		Jimmy.removeMarkAtIndex(1);
		
		System.out.println(Jimmy);
		System.out.println("This is " + Timmy);
		
	}

}
