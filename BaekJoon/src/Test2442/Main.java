package Test2442;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int num = s.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = i + 1; j < num; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			for (int l = 0; l < i; l++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
