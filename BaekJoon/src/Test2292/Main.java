package Test2292;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // 입력값
		int x = 1; // 동일 선상의 최대 벌집 번호
		int cnt = 1; // 라인 카운트

		while (n > x) {
			x += cnt * 6;
			cnt++;
		}
		System.out.println(cnt);
	}

}
