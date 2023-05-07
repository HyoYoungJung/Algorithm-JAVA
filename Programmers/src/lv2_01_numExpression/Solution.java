package lv2_01_numExpression;

class Solution {
	public int solution(int n) {
		int cnt = 1; // 가능한 방법의 수 카운트
		for (int i = 1; i <= n / 2; i++) { // 덧셈을 시작할 수 지정
			int answer = 0;
			for (int j = i; j <= n / 2 + 1; j++) {
				answer += j;
				if (answer >= n) {
					if (answer == n) {
						cnt++;
					}
					break;
				}
			}
		}
		return cnt;
	}
}