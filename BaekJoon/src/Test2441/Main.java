package Test2441;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int num = s.nextInt();

		for (int i = 0; i < num; i++) { // 5줄
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k < num; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
