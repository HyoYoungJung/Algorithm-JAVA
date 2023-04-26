package lv0_01_sumOfDivisor;

class Solution {
	public int solution(int n) {

		int num = n;
		int answer = 0;

		while (num >= 1) {
			if (n % num == 0) {
				answer += num;
			}
			num--;
		}
		return answer;
	}
}