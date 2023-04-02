package pgCollatz;

public class Solution {
	public int solution(int num) {
		int cnt = 0;
		if (num == 1) {
			return 0;
		} else {
			while (true) {
				cnt++;
				if (num % 2 == 0) {
					num /= 2;
				} else if (num % 2 == 1) {
					num *= 3;
					num++;
				}
				if (cnt > 500) {
					return -1;
				}
				if (num == 1) {
					return cnt;
				}
			}
		}
	}
}
