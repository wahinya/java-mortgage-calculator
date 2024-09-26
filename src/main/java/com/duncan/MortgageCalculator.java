package com.duncan;

import java.text.NumberFormat;
import java.util.Scanner;

import static java.lang.Byte.parseByte;
import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;

public class MortgageCalculator {
    private int getPrinciple() {
        return principle;
    }

    private void setPrinciple(int principle) {
        this.principle = principle;
    }

    private double getAnnualRate() {
        return annualRate;
    }

    private void setAnnualRate(double annualRate) {
        this.annualRate = annualRate;
    }

    private int getPeriod() {
        return period;
    }

    private void setPeriod(byte period) {
        this.period = period;
    }

    private int principle;
    double annualRate;
    byte period;

    final byte MONTHS_OF_THE_YEAR = 12;
    final byte PERCENTAGE = 100;

    void  captureLoanData() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
        System.out.print("Principle: ");
        setPrinciple(parseInt(scanner.nextLine().trim()));
        if (principle >=1000 && principle <= 1000000)
            break;
        System.out.println("ERROR! -> Enter a value between 1000 - 1000000!");
    }

     while(true) {
         System.out.print("Annual rate: ");
         setAnnualRate(parseFloat(scanner.nextLine().trim()));
         if (annualRate > 1 && annualRate < 30)
             break;
         System.out.println("ERROR! -> Enter a rate between 1 and 30!");
     }

     while(true) {
         System.out.print("Period:");
         setPeriod(parseByte(scanner.nextLine().trim()));
         if(period >1 && period <10)
             break;
         System.out.println("ERROR! -> Loan can be issue for 1 to 10 years!");
     }
    }
      // n = number of payments
    // r = monthly interest rate
    // m = mortgage payment

    String calculate(){
        Double r = (getAnnualRate()/PERCENTAGE)/MONTHS_OF_THE_YEAR;
        int n = getPeriod()*MONTHS_OF_THE_YEAR;
        Double m = (double) getPrinciple()*(r*Math.pow((1+r), n)/(Math.pow((1+r), n)-1));
    return NumberFormat.getCurrencyInstance().format(m);
    }
}
