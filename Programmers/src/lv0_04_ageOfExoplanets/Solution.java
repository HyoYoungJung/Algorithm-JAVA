package lv0_04_ageOfExoplanets;

class Solution {
	public String solution(int age) {
		String answer = "";

		String age962 = "abcdefghij";
		String[] arr = String.valueOf(age).split("");

		for (int i = 0; i < arr.length; i++) {
			answer += age962.charAt(Integer.valueOf(arr[i]));
		}

		return answer;
	}
}