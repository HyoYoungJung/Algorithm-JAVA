package lv1_12_longDescending;

import java.util.Arrays;
import java.util.Collections;

class Solution {
	public long solution(long n) {

		String[] arr = String.valueOf(n).split("");

		Arrays.sort(arr, Collections.reverseOrder());

		long answer = Long.parseLong(String.join("", arr));

		return answer;
	}
}