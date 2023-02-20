package org.ssglobal.training.codes.itemF;

public class TestFraction {

	public static void main(String[] args) {
		Fraction f1 = new Fraction(1, 2);
        f1.printRational();
        Fraction f2 = new Fraction(3, 7);
        f2.printRational();       
        Fraction f3 = f2.multiply(f1);
        f3.printRational();
        Fraction f4 = f2.add(f1);
        f4.printRational();       
        System.out.println(f2.greaterEqual(f1));
        System.out.println(f4.greaterEqual(f1));
	}

}
