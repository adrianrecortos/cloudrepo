package org.ssglobal.training.codes.itemC;

public class GeneralMethods {

	public void powersOfTwo() {
        int power = 2;
        for (int i = 0; i < 10; i++) {
            System.out.print(power + " ");
            power *= 2;
        }
    }
    
    public void alarm(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("\nAlarm!");
        }
    }

    public int sum100() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }

    public int sumRange(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }

    public int maxOfTwo(int x, int y) {
        return (x > y) ? x : y;
    }

    public boolean larger(double x, double y) {
        return (x > y) ? true : false;
    }

    public boolean evenlyDivisible(int x, int y) {
        return (x % y == 0 || y % x == 0) ? true : false;
    }
}
