package test5597;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int[] sNum = new int[31];

		for (int i = 0; i < 28; i++) {
			int arrNum = s.nextInt();
			sNum[arrNum] = 1;
		}
		for (int i = 1; i < sNum.length; i++) {
			if (sNum[i] != 1) {
				System.out.println(i);
			}
		}
	}
}
