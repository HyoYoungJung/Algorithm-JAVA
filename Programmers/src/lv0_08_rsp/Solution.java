package lv0_08_rsp;

class Solution {
	public String solution(String rsp) {
		String answer = ""; // 결과값 저장할 문자열
		String[] arr = rsp.split(""); // rsp의 각 문자를 배열에 저장

		for (int i = 0; i < rsp.length(); i++) { // 배열에서 꺼낸 문자 판별
			if (arr[i].equals("2")) { // 가위면
				answer += "0";
			} else if (arr[i].equals("0")) { // 바위면
				answer += "5";
			} else if (arr[i].equals("5")) { // 보면
				answer += "2";
			}
		}
		return answer;
	}
}