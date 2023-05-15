package lv1_230501;

class NNumsSpacedByX {
	public long[] solution(int x, int n) {
		long[] answer = new long[n];
		long sum = 0;

		for (int i = 0; i < n; i++) {
			sum += x;
			answer[i] = sum;
		}
		return answer;
	}
}