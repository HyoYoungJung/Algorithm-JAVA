package lv0_07_decryption;

class Solution {
	public String solution(String cipher, int code) {

		String answer = ""; // 결과값 담을 문자열

		String[] arr = new String[cipher.length()]; // cipher의 각 문자를 저장할 배열

		arr = cipher.split(""); // cipher의 각 문자를 배열에 저장

		for (int i = code - 1; i < cipher.length(); i += code) { // code의 값 만큼씩 증가
			answer += arr[i]; // 문자열에 code의 배수번째 글자를 추가
		}
		return answer;
	}
}