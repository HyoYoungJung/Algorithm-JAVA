package test11021;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int T = s.nextInt();

		for (int i = 1; i <= T; i++) {

			int A = s.nextInt(), B = s.nextInt();

			System.out.println("Case #" + i + ": " + (A + B));
		}
	}
}