package org.ssglobal.training.codes.itemA;

public class BadNews {
	
	public static void writeOdds(final int MAX_ODD) {
		int counter;
		for (counter = 1; counter <= (MAX_ODD - 2); counter++) {
		System.out.print(counter + " ");
		counter = counter + 1;
		}
		System.out.print(MAX_ODD + "\n");
	}
	
	public static void main(String[] args) {
		writeOdds(21);
		writeOdds(11);
	}
}
