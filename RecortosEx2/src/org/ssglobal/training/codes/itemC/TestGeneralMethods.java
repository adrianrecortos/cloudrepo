package org.ssglobal.training.codes.itemC;

public class TestGeneralMethods {

	public static void main(String[] args) {
        GeneralMethods a = new GeneralMethods();
        a.powersOfTwo();
        a.alarm(2);
        int sum100 = a.sum100();
        System.out.println(sum100);
        int sumRange = a.sumRange(10, 20);
        System.out.println(sumRange);
        int max = a.maxOfTwo(10, 20);
        System.out.println(max);
        boolean larger = a.larger(10.5, 20.5);
        System.out.println(larger);
        boolean evenlyDivisible = a.evenlyDivisible(10, 20);
        System.out.println(evenlyDivisible);
	}

}
