package test10872;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int N = s.nextInt();
		int sum = 1;

		for (int i = N; i > 0; i--) {
			sum *= i;
		}
		System.out.println(sum);
	}
}
