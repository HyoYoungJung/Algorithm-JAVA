package Test2480;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int rs;

		if (a == b && b == c) {
			rs = 10000 + a * 1000;
		} else if (a == b || a == c) {
			rs = 1000 + a * 100;
		} else if (b == c) {
			rs = 1000 + b * 100;
		} else {
			int max = Math.max(Math.max(a, b), c);
			rs = max * 100;
		}
		System.out.println(rs);
	}
}
