package Test2444;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int num = s.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = i - 1; j < num - 1; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < num - 1; i++) {
			for (int j = 0; j <= i + 1; j++) {
				System.out.print(" ");
			}
			for (int k = i; k <= num + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
