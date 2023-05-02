package test11022;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int T = s.nextInt();

		for (int i = 1; i <= T; i++) {

			int A = s.nextInt(), B = s.nextInt();

			System.out.printf("Case #%d: %d + %d = %d%n", i, A, B, A + B);
		}
	}
}
