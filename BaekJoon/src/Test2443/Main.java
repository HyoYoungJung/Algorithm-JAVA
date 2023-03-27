package Test2443;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int num = s.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k < num; k++) {
				System.out.print("*");
			}
			for (int l = i; l < num - 1; l++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
