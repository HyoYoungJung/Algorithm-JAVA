package test2738;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int N = s.nextInt();
		int M = s.nextInt();

		int[][] arr = new int[N][M];

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < M; k++) {
					arr[j][k] += s.nextInt();
				}
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
