package test9086;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int T = s.nextInt();

		for (int i = 0; i < T; i++) {

			String str = s.next();

			String first = String.valueOf(str.charAt(0));
			String last = String.valueOf(str.charAt(str.length() - 1));

			System.out.println(first + last);
		}
	}
}
