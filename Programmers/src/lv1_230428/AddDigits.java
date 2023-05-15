package lv1_230428;

public class AddDigits {
	public int solution(int n) {
		int answer = 0;

		String[] arr = String.valueOf(n).split("");

		for (String s : arr) {
			answer += Integer.parseInt(s);
		}

		return answer;
	}
}