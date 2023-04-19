package test2754;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String grade = sc.next();

		if (grade.equals("F")) {
			System.out.println("0.0");
			return;
		}

		double score = 0.0;
		score += 69 - grade.charAt(0);

		switch (grade.charAt(1)) {
		case '+':
			score += 0.3;
			break;
		case '-':
			score -= 0.3;
		}
		System.out.println(score);
	}
}
