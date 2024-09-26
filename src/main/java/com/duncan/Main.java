package com.duncan;

public class Main {

    public static void main(String[] args) {
        // System.out.println(Lexicographically.isSorted(new String[] {"1445//@dun9can"}));
        MortgageCalculator mortgageCalculator = new MortgageCalculator();
        mortgageCalculator.captureLoanData();
        System.out.println(mortgageCalculator.calculate());
    }
}
