package test2475;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int sum = 0;

		for (int i = 0; i < 5; i++) {
			int n = s.nextInt();
			sum += n * n;
		}
		System.out.println(sum % 10);
	}
}
