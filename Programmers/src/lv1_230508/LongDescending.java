package lv1_230508;

import java.util.Arrays;
import java.util.Collections;

class LongDescending {
	public long solution(long n) {

		String[] arr = String.valueOf(n).split("");

		Arrays.sort(arr, Collections.reverseOrder());

		long answer = Long.parseLong(String.join("", arr));

		return answer;
	}
}