package test10951;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		while (s.hasNextInt()) {
			int A = s.nextInt(), B = s.nextInt();
			System.out.println(A + B);
		}
	}
}
