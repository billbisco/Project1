package javacode.exercises.JavaLearnings;
import java.math.BigDecimal;

import java.math.BigDecimal;

public class SimpleInterestCalculator {

    BigDecimal principal;

    BigDecimal interest;

    public SimpleInterestCalculator(String principal, String interest) {
        this.principal = new BigDecimal(principal);
        this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
    }

    public BigDecimal calculateTotalValue(int noOfYears) {
        // Total Value = principal + principal * interest * noOfYears;
        BigDecimal noOfYearsBigDecimal = new BigDecimal(noOfYears);
        BigDecimal totalValue = principal.add(principal.multiply(interest).multiply(noOfYearsBigDecimal));
        return totalValue;
    }

    public static void main(String[] args) {

            SimpleInterestCalculator calculator =
                    new SimpleInterestCalculator("4500.00", "7.5");
            BigDecimal totalValue =
                    calculator.calculateTotalValue(5);// 5 years
            //6187.50000
            System.out.println(totalValue);
        }

    }

