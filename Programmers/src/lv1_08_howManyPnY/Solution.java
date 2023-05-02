package lv1_08_howManyPnY;

class Solution {
	boolean solution(String s) {
		boolean answer = true;

		s = s.toLowerCase();
		int cntP = 0, cntY = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'p') {
				cntP++;
			} else if (s.charAt(i) == 'y') {
				cntY++;
			}
		}
		if (cntP != cntY) {
			answer = false;
		}
		return answer;
	}
}