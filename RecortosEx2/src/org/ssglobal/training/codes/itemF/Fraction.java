package org.ssglobal.training.codes.itemF;

public class Fraction {

    public int numerator;
    public int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void printRational() {
        System.out.println(numerator + "/" + denominator);
    }

    public Fraction add(Fraction summand) {
        int newNumerator = numerator * summand.getDenominator() + summand.getNumerator() * denominator;
        int newDenominator = denominator * summand.getDenominator();
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction multiply(Fraction factor) {
        int newNumerator = numerator * factor.getNumerator();
        int newDenominator = denominator * factor.getDenominator();
        return new Fraction(newNumerator, newDenominator);
    }

    public boolean greaterEqual(Fraction comp) {
        double value1 = (double) numerator / denominator;
        double value2 = (double) comp.getNumerator() / comp.getDenominator();
        return (value1 >= value2);
    }

}
